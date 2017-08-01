package com.example.nklee.wallet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {


    int total, oman, man, ochun, chun, obak, bak, osib, sib;
    TextView totaltext, omantext, mantext, ochuntext, chuntext, obaktext, baktext, osibtext, sibtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totaltext = (TextView) findViewById(R.id.textView);
        omantext = (TextView) findViewById(R.id.textView2);
        mantext = (TextView) findViewById(R.id.textView3);
        ochuntext = (TextView) findViewById(R.id.textView4);
        chuntext = (TextView) findViewById(R.id.textView5);
        obaktext = (TextView) findViewById(R.id.textView6);
        baktext = (TextView) findViewById(R.id.textView7);
        osibtext = (TextView) findViewById(R.id.textView8);
        sibtext = (TextView) findViewById(R.id.textView9);

        File file = new File(getFilesDir(), "data2.dat");

        try{
            FileInputStream fos = new FileInputStream(file);
            DataInputStream dos = new DataInputStream(fos);
            total = dos.readInt();
            totaltext.setText(String.valueOf(total));
            oman = dos.readInt();
            omantext.setText(String.valueOf(oman));
            man = dos.readInt();
            mantext.setText(String.valueOf(man));
            ochun = dos.readInt();
            ochuntext.setText(String.valueOf(ochun));
            chun = dos.readInt();
            chuntext.setText(String.valueOf(chun));
            obak = dos.readInt();
            obaktext.setText(String.valueOf(obak));
            bak = dos.readInt();
            baktext.setText(String.valueOf(bak));
            osib = dos.readInt();
            osibtext.setText(String.valueOf(osib));
            sib = dos.readInt();
            sibtext.setText(String.valueOf(sib));

            dos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void onOmanClicked(View v) {
        oman++;
        omantext.setText(String.valueOf(oman));

       total = total + 50000;
        totaltext.setText(String.valueOf(total));
    }

    public void onButton2Clicked(View v) {
        man++;
        mantext.setText(String.valueOf(man));

       total = total + 10000;
        totaltext.setText(String.valueOf(total));
    }

    public void onButton3Clicked(View v) {
        ochun++;
        ochuntext.setText(String.valueOf(ochun));

       total = total + 5000;
        totaltext.setText(String.valueOf(total));
    }

    public void onButton4Clicked(View v) {
        chun++;
        chuntext.setText(String.valueOf(chun));

       total = total + 1000;
        totaltext.setText(String.valueOf(total));
    }

    public void onButton5Clicked(View v) {
        obak++;
        obaktext.setText(String.valueOf(obak));

        total = total + 500;
        totaltext.setText(String.valueOf(total));
    }

    public void onButton6Clicked(View v) {
        bak++;
        baktext.setText(String.valueOf(bak));

        total = total + 100;
        totaltext.setText(String.valueOf(total));
    }

    public void onButton7Clicked(View v) {
        osib++;
        osibtext.setText(String.valueOf(osib));

        total = total + 50;
        totaltext.setText(String.valueOf(total));
    }

    public void onButton8Clicked(View v) {
        sib++;
        sibtext.setText(String.valueOf(sib));

        total = total + 10;
        totaltext.setText(String.valueOf(total));
    }


    //빼기

    public void onButton9Clicked(View v) {
        if (oman > 0) {
            oman--;
            omantext.setText(String.valueOf(oman));

            total = total - 50000;
            totaltext.setText(String.valueOf(total));
        } else {
            Toast.makeText(this, "Can't be < 0", Toast.LENGTH_SHORT).show();
        }
    }

    public void onButton10Clicked(View v) {
        if (man>0) {
            man--;
            mantext.setText(String.valueOf(man));

            total = total - 10000;
            totaltext.setText(String.valueOf(total));
        } else {
            Toast.makeText(this, "Can't be < 0", Toast.LENGTH_SHORT).show();
        }
    }

    public void onButton11Clicked(View v) {
        if (ochun>0) {
            ochun--;
            ochuntext.setText(String.valueOf(ochun));

            total = total - 5000;
            totaltext.setText(String.valueOf(total));
        } else {
            Toast.makeText(this, "Can't be < 0", Toast.LENGTH_SHORT).show();
        }
    }

    public void onButton12Clicked(View v) {
        if (chun>0) {
            chun--;
            chuntext.setText(String.valueOf(chun));

            total = total - 1000;
            totaltext.setText(String.valueOf(total));
        } else {
            Toast.makeText(this, "Can't be < 0", Toast.LENGTH_SHORT).show();
        }
    }

    public void onButton13Clicked(View v) {
        if (obak>0) {
            obak--;
            obaktext.setText(String.valueOf(obak));

            total = total - 500;
            totaltext.setText(String.valueOf(total));
        } else {
            Toast.makeText(this, "Can't be < 0", Toast.LENGTH_SHORT).show();
        }
    }



    public void onButton14Clicked(View v) {
        if (bak>0) {
            bak--;
            baktext.setText(String.valueOf(bak));

            total = total - 100;
            totaltext.setText(String.valueOf(total));
        } else {
            Toast.makeText(this, "Can't be < 0", Toast.LENGTH_SHORT).show();
        }
    }

    public void onButton15Clicked(View v) {
        if (osib>0) {
            osib--;
            osibtext.setText(String.valueOf(osib));

            total = total - 50;
            totaltext.setText(String.valueOf(total));
        } else {
            Toast.makeText(this, "Can't be < 0", Toast.LENGTH_SHORT).show();
        }
    }

    public void onButton16Clicked(View v) {
        if (sib>0) {
            sib--;
            sibtext.setText(String.valueOf(sib));

            total = total - 10;
            totaltext.setText(String.valueOf(total));
        } else {
            Toast.makeText(this, "Can't be < 0", Toast.LENGTH_SHORT).show();
        }
    }

    public void onButton17Clicked(View v) {

        File file = new File(getFilesDir(), "data2.dat");
        try{
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(total);
            dos.writeInt(oman);
            dos.writeInt(man);
            dos.writeInt(ochun);
            dos.writeInt(chun);
            dos.writeInt(obak);
            dos.writeInt(bak);
            dos.writeInt(osib);
            dos.writeInt(sib);

            dos.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//
//    public void makeallzero() {
//        total = 0;
//        totaltext.setText(String.valueOf(total));
//        oman = 0;
//        omantext.setText(String.valueOf(oman));
//        man = 0;
//        mantext.setText(String.valueOf(man));
//        ochun = 0;
//        ochuntext.setText(String.valueOf(ochun));
//        chun = 0;
//        chuntext.setText(String.valueOf(chun));
//        obak = 0;
//        obaktext.setText(String.valueOf(obak));
//        bak = 0;
//        baktext.setText(String.valueOf(bak));
//        osib = 0;
//        osibtext.setText(String.valueOf(osib));
//        sib = 0;
//        sibtext.setText(String.valueOf(sib));
//    }
//
//
//    public void readFromFile() {
//        File file = new File(getFilesDir(), "data.dat");
//
//        try{
//            FileInputStream fos = new FileInputStream(file);
//            DataInputStream dos = new DataInputStream(fos);
//            total = dos.readInt();
//            totaltext.setText(String.valueOf(total));
//            oman = dos.readInt();
//            omantext.setText(String.valueOf(oman));
//            man = dos.readInt();
//            mantext.setText(String.valueOf(man));
//            ochun = dos.readInt();
//            ochuntext.setText(String.valueOf(ochun));
//            chun = dos.readInt();
//            chuntext.setText(String.valueOf(chun));
//            obak = dos.readInt();
//            obaktext.setText(String.valueOf(obak));
//            bak = dos.readInt();
//            baktext.setText(String.valueOf(bak));
//            osib = dos.readInt();
//            osibtext.setText(String.valueOf(osib));
//            sib = dos.readInt();
//            sibtext.setText(String.valueOf(sib));
//
//            dos.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }

}
