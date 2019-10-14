package task6;


	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.*;

    public class Reader {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Введите путь к файлу, например\"C:\\\\Users\\\\user\\\\IdeaProjects\\\\AplanaJava_2.0\\\\task6\\\\words.txt\": ");
            String path = in.nextLine();
            in.close();

            File file = new File(path);
            ArrayList<String> arrayListLine = null;
            ArrayList<String> arrayList = null;
            try (Scanner sc = new Scanner(file)) {
                arrayListLine = new ArrayList<>();
                arrayList = new ArrayList<>();
                while (sc.hasNextLine()) {
                    arrayListLine.add(sc.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("Такого файла нет!");
                return;
            }
            if(arrayListLine.size() == 0){
                System.out.println("Файл пуст!");
                return;
            }

            Iterator<String> iterator = arrayListLine.iterator();

            while (iterator.hasNext()){
                String[] m = iterator.next().split(" |,|\\.|\\?|!|\\t");
                for (int i = 0; i < m.length; i++){
                    arrayList.add(m[i]);
                }
            }
            Collections.sort(arrayList);
            System.out.println("Сортировка по алфавиту: " + arrayList.toString());

            String st = arrayList.get(0);
            int i = 0;
            int max = 0;
            ArrayList<String>  arrayList1 = new ArrayList<>();
            arrayList1.add(null);
            Iterator<String> iterator1 = arrayList.iterator();

            while(true){
                if(iterator1.hasNext()) {
                    String st1 = iterator1.next();
                    if (st1.equals(st)) {
                        i++;
                    } else {
                        System.out.println(st + " встречается " + i + " раза");
                        i = 1;
                        st = st1;
                    }
                    if(max < i){
                        max = i;
                        arrayList1.clear();
                        arrayList1.add(st);
                        continue;
                    }
                    if(max == i){
                        arrayList1.add(st);
                    }
                }
                else{
                    System.out.println(st + " встречается " + i + " раза");
                    break;
                }
            }
            System.out.println("C максимальной частотой в " + max + " раза встречаются данные слова "+ arrayList1.toString());
        }
    }


