package ch.hslu.demo.sw12;

import java.io.*;

public class FileWriter {

    public void writeFileInt(String file, int i) throws IOException {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file))) {
            out.writeInt(i);
        }
    }

    public void writeFileIntFloat(String file, int i, float f) throws IOException {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file))) {
            out.writeInt(i);
            out.writeFloat(f);
        }
    }

    public int readFileInt(String file) throws IOException {
        try (DataInputStream in = new DataInputStream(new FileInputStream(file))) {
            return in.readInt();
        }
    }

    public float readFileIntFloat(String file) throws IOException {
        try (DataInputStream in = new DataInputStream(new FileInputStream(file))) {
            in.readInt();
            return in.readFloat();
        }
    }
}
