/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.Scanner;

/**
 *
 * @author Red King
 */
public class Test {

    public static void main(String[] args) {
        GenericStack<String> s = new GenericStack<String>();
        GenericQueue<String> q = new GenericQueue<String>();

        System.out.print("Enter line: ");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            q.enqueue(words[i]);
        }
        while(!q.isEmpty()){
            s.push(q.dequeue());
        }
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }
}
