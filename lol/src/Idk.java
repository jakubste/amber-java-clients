import pl.edu.agh.amber.common.AmberClient;
import pl.edu.agh.amber.hitec.HitecProxy;

import java.io.IOException;


public class Idk {
    public static void main(String[] args) {
        AmberClient client = null;
        try {
            client = new AmberClient("192.168.43.233", 26233);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        System.out.println(client);
        HitecProxy hitecProxy = new HitecProxy(client, 0);
        System.out.println(hitecProxy);

        System.out.println(hitecProxy);

        for (int i = 1; i <= 10; i++) {
            hitecProxy.setAngle(0, 9 * i);
            hitecProxy.setSpeed(0, 10);
            hitecProxy.setAngle(1, 9 * i);
            hitecProxy.setSpeed(1, 10);
            hitecProxy.setAngle(2, 9 * i);
            hitecProxy.setSpeed(2, 10);
            hitecProxy.setAngle(3, 9 * i);
            hitecProxy.setSpeed(3, 10);
            hitecProxy.setAngle(4, 9 * i);
            hitecProxy.setSpeed(4, 10);
            hitecProxy.setAngle(5, 9 * i);
            hitecProxy.setSpeed(5, 10);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        client.terminate();
    }
}
