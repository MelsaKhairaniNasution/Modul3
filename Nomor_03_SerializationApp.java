package Modul_03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Nomor_03_SerializationApp {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        List<Contoh_02_Participant> participants = new ArrayList<Contoh_02_Participant>();

        String first = null, last = null, age;
        int g = 0;

                first = JOptionPane.showInputDialog("Masukkan Nama Depan!");
                last = JOptionPane.showInputDialog("Masukkan Nama Belakang!");
                age = JOptionPane.showInputDialog("Masukkan Umur!");
                g = Integer.parseInt(age);

        System.out.println("Participant: "+ participants +"\n");

        Contoh_02_SerializationDemo demo = new Contoh_02_SerializationDemo();
        demo.serialize(participants, "d:/B_16650052/Modul 03/participantDataInput.ser");
        System.out.println("Serialization is Done\n");

        System.out.println("Deserialize Object...");
        List<Contoh_02_Participant> newList = demo.deserialize("d:/B_16650052/Modul 03/participantDataInput.ser");
        System.out.println("New List: "+newList);
    }
}
