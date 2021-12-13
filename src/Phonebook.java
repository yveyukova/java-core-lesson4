import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Phonebook {
    private HashMap<String, String> surnamePhone = new HashMap<>();

public void add(String phone, String surname ){
    surnamePhone.put(phone, surname);
}
public List<String> get(String surname){
    return surnamePhone
            .entrySet()
            .stream()
            .filter(e -> Objects.equals(e.getValue(), surname))
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
}
}
