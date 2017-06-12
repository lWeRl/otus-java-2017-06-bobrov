package org.lwerl.objectsize.factory;

/**
 * Created by lWeRl on 12.06.2017.
 */
public class String5LettersSize extends InstanceSize {
    @Override
    void run() {
        getFreeMemory();
        Object[] s = new Object[count];
        long init = getFreeMemory();
        for (int j = 0; j < count; ++j) {
            s[j] = new String(new char[]{'t', 'e', 's', 't', '!'});
        }
        memoryDiff = init - getFreeMemory();
        instance = s[0];
    }
}
