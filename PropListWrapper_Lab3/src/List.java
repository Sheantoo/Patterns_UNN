import java.util.*;

public class List {
    private String name;
    private ArrayList<List> list;

    {
        list = new ArrayList<>();
    }

    public void add(String properties) {
        if (properties.contains(".")) {
            int dotIndex = properties.indexOf(".");
            String nameFromString = properties.substring(0, dotIndex);

            List firstNext = new List();
            String secondPartOfStr = properties.substring(dotIndex + 1);

            if (list == null) {
                list = new ArrayList<>();
            }
            if (name == null) {
                name = nameFromString;
            } else {
                String nextName;
                if (secondPartOfStr.contains(".")){
                    nextName = secondPartOfStr.substring(0, secondPartOfStr.indexOf("."));
                }
                else {
                    nextName = secondPartOfStr;
                }
                for (List wrapper : list) {
                    String wrapperName = wrapper.getName();
                    if (wrapperName.equals(nextName)) {
                        wrapper.add(secondPartOfStr);
                        return;
                    }
                }
            }
            firstNext.add(properties.substring(dotIndex + 1));
            list.add(firstNext);
        } else {
            name = properties;
        }
    }

    public String getName() {
        return name;
    }

    public void showList() {
        System.out.println(name);
        for (var subList : list) {
            subList.showList();
        }
    }



}
