package chapter11.item74;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Main {

    public static void main(String[] args) {

        try {
            Video video = new Video("test url", "test title");
            System.out.println(video.getUrl() + ", " + video.getTitle());

            // serialization
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("temp.txt"));
            oos.writeObject(video);
            oos.close();

            // deserialization
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("temp.txt"));
            Video video2 = (Video) ois.readObject();
            ois.close();
            System.out.println(video2.getUrl() + ", " + video2.getTitle());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Sub sub = new Sub();

            // serialization
            ObjectOutputStream oos
                    = new ObjectOutputStream(new FileOutputStream("temp.txt"));
            oos.writeObject(sub);
            oos.close();

            // deserialization
            ObjectInputStream ois
                    = new ObjectInputStream(new FileInputStream("temp.txt"));
            Sub sub2 = (Sub) ois.readObject();
            ois.close();
            System.out.println(sub2.version + ", " + sub2.defaultVersion);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Foo foo = new Foo(10, 20);

            // serialization
            ObjectOutputStream oos
                    = new ObjectOutputStream(new FileOutputStream("temp.txt"));
            oos.writeObject(foo);
            oos.close();

            // deserialization
            ObjectInputStream ois
                    = new ObjectInputStream(new FileInputStream("temp.txt"));
            Foo foo2 = (Foo) ois.readObject();
            ois.close();
            System.out.println(foo2.getX() + ", " + foo2.getY());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
