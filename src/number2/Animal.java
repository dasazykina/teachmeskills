package number2;


import java.util.Arrays;

public class Animal {
    public String[] animalsCollection = new String[10];

    public void add(String animalName) {
        System.out.println(getSize());
        if (getSize() == 0) {
            animalsCollection[0] = animalName;
        } else {
            for (int i = getSize(); i > 0; i--) {
                animalsCollection[i] = animalsCollection[i - 1];
            }
            animalsCollection[0] = animalName;
        }
    }

    public void remove() {
        animalsCollection[getSize() - 1] = null;

    }

    public int getSize() {
        int size = 0;
        for (int i = 0; i < animalsCollection.length; i++) {
            if (animalsCollection[i] == null) {
                size = i;
                break;
            }
        }
        return size;
    }

    public void getString() {
        System.out.println(Arrays.toString(animalsCollection));
    }
}
