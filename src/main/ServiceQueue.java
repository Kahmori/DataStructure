package main;

import java.util.Random;

import structures.*;

public class ServiceQueue {

  public static void main(String[] args) {
    int n = 5;
    var random = new Random();
    int cliente = random.nextInt(101);
    Queue queue = new Queue(cliente);
    System.out.println("Chegou o cliente: " + cliente);

    for(int i = 2; i <= n; i++){
      cliente = random.nextInt(101);
      System.out.println("Chegou o cliente: " + cliente);
      queue.enqueue(cliente);
    }

    var node = queue.dequeue();
    while (node != null) {
      System.out.println("Atendido o cliente: " + node.getValue());
      node = queue.dequeue();
    }
  }
}
