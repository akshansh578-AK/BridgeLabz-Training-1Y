package com.logistics.routestracker.list;

import com.logistics.routestracker.checkpoints.Checkpoint;

public class RouteLinkedList<T extends Checkpoint> {
    private Node<T> head;

    public void addCheckpoint(T checkpoint) {
        Node<T> newNode = new Node<>(checkpoint);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public double computeTotalDistance() {
        double total = 0;
        Node<T> temp = head;
        while (temp != null) {
            total += temp.data.getDistance();
            temp = temp.next;
        }
        return total;
    }

    public double computeTotalPenalty() {
        double total = 0;
        Node<T> temp = head;
        while (temp != null) {
            total += temp.data.calculatePenalty();
            temp = temp.next;
        }
        return total;
    }

    public boolean checkCritical() {
        boolean hasDelivery = false;
        boolean hasFuel = false;
        Node<T> temp = head;

        while (temp != null) {
            if (temp.data.getType().equals("DeliveryCheckpoint")) {
                hasDelivery = true;
            }
            if (temp.data.getType().equals("FuelCheckpoint")) {
                hasFuel = true;
            }
            temp = temp.next;
        }
        return hasDelivery && hasFuel;
    }

    public void printRoute() {
        Node<T> temp = head;
        int i = 1;

        while (temp != null) {
            T cp = temp.data;
            System.out.println(i + ". " + cp.getType() + " - " + cp.getLocationName() +
                    " - " + (cp.isDelayed() ? "Delayed" : "On Time") +
                    " - Penalty: " + cp.calculatePenalty());
            temp = temp.next;
            i++;
        }
    }
}