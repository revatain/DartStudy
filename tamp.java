import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Temp{
    public static void main(String[] args) {
        List<String> list = List.of("jaybon","sunny", "duck");
        List<String> result1 = new ArrayList<>();
        for (String str : list) {
            if(str.contains("u")){
                result1.add(str);
            }
            //stream은 데이터의 흐름을 이용하여 작업한다. (한꺼번에 데이터 처리함.)
            // .collect 등을 호출 했을 때 보기가 쉽고 함수형 프로그래밍을 이용할수 있다.
          List<String> result2 = new ArrayList<>();
          for(String string: result1) {
            result2.add (str + "@temp.com");
          }  
        }
        list.stream().filter(str -> str.contains("str")).map(str -> str + "@tamp.com").collect(Collectors.toList());
    }
}