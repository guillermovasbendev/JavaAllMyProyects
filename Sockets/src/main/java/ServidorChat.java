

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import javax.swing.*;

public class ServidorChat {
    private ArrayList<PrintWriter> clientes = new ArrayList<>();
    private JTextArea areaChat;

    public ServidorChat() {
        JFrame frame = new JFrame("Servidor de Chat");
        areaChat = new JTextArea();
        frame.add(new JScrollPane(areaChat));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
        iniciarServidor();
    }

    private void iniciarServidor() {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            areaChat.append("Servidor iniciado. Esperando clientes...\n");

            while (true) {
                Socket clienteSocket = serverSocket.accept();
                PrintWriter escritor = new PrintWriter(clienteSocket.getOutputStream());
                clientes.add(escritor);

                Thread t = new Thread(new ManejadorCliente(clienteSocket));
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void enviarMensaje(String mensaje) {
        for (PrintWriter escritor : clientes) {
            escritor.println(mensaje);
            escritor.flush();
        }
    }

    private class ManejadorCliente implements Runnable {
        private Socket socket;
        private BufferedReader lector;

        public ManejadorCliente(Socket socket) {
            this.socket = socket;
            try {
                lector = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            String mensaje;
            try {
                while ((mensaje = lector.readLine()) != null) {
                    if (mensaje.equalsIgnoreCase("chao")) {
                        areaChat.append("Usuario desconectado.\n");
                        clientes.remove(socket.getOutputStream());
                        break;
                    } else {
                        areaChat.append("Mensaje recibido: " + mensaje + "\n");
                        enviarMensaje(mensaje);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new ServidorChat();
    }
}
