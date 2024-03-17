package lv2;

import java.util.*;

public class 택배_배달과_수거하기_study {
    public class Node {
        private int number;
        private int box;

        public Node(int number, int box) {
            this.number = number;
            this.box = box;
        }
    }
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;

        Stack<Node> deli = new Stack<>();
        Stack<Node> pick = new Stack<>();

        // 배달, 수거할 집들만 넣기
        for (int i = 0; i < n; i++) {
            if (deliveries[i] != 0) {
                deli.push(new Node(i + 1, deliveries[i]));
            }
            if (pickups[i] != 0) {
                pick.push(new Node(i + 1, pickups[i]));
            }
        }

        while (!deli.isEmpty() || !pick.isEmpty()) {
            int nowDelivery = cap;
            int nowPickup = cap;
            if (deli.isEmpty()) {
                answer += pick.peek().number * 2L;
            }
            else if (pick.isEmpty()) {
                answer += deli.peek().number * 2L;
            } else {
                answer += Math.max(deli.peek().number, pick.peek().number) * 2L;
            }

            while (!deli.isEmpty()) {
                if (deli.peek().box > nowDelivery) {
                    Node node = deli.pop();
                    deli.push(new Node(node.number, node.box - nowDelivery));
                    break;
                } else {
                    nowDelivery -= deli.pop().box;
                }
            }
            while (!pick.isEmpty()) {
                if (pick.peek().box > nowPickup) {
                    Node node = pick.pop();
                    pick.push(new Node(node.number, node.box - nowPickup));
                    break;
                } else {
                    nowPickup -= pick.pop().box;
                }
            }
        }

        // 최소 이동 거리
        return answer;
    }

    public static void main(String[] args) {
        택배_배달과_수거하기_study p = new 택배_배달과_수거하기_study();
        int[] d = {1, 0, 3, 1, 2};
        int[] pp = {0, 3, 0, 4, 0};
        System.out.println(p.solution(4, 5, d, pp));
    }
}
