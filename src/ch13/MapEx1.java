package ch13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		// K : Key를 무슨 타입을 담을 것인지 지정
		// V : Value를 무슨 타입으로 담을 것인지 지정
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("id_0123", "홍길동");
		map.put("id_0124", "고길동");
		map.put("id_0125", "김길동");
		map.put("id_0126", "최길동");
		
		System.out.println("키에 해당하는 값 가져오기 : "+map.get("id_0125"));
		System.out.println("키가 존재하는지 확인 : "+map.containsKey("id_0126"));
		System.out.println("값이 존재하는지 확인 : "+map.containsValue("이길동"));
		System.out.println("맵이 비어있는지 확인 : "+map.isEmpty());
		System.out.println("맵크기 : "+map.size());
		System.out.println("맵 요소 삭제 : "+map.remove("id_0126"));
		
		// key 값만 가져오기
		Set<String> keyvalue = map.keySet();
		System.out.println(keyvalue);
		
		// value 값만 가져오기
		Collection<String> values = map.values();
		System.out.println(values);
	}

}
