package lear;

import java.util.EnumMap;
import java.util.Map;
enum Color{红色,绿色,蓝色};

public class EnumMapDemo {

	public static void main(String[] args) {
		EnumMap<Color,String> eMap=new EnumMap<Color,String>(Color.class);
		eMap.put(Color.红色,"Red");//添加EnumMap元素
		eMap.put(Color.绿色,"Green");//将Color.红色作为Key，将“Green”作为映射的值
		eMap.put(Color.蓝色,"Blue");
		for(Map.Entry<Color, String>me:eMap.entrySet()){
			System.out.println(me.getKey()+"-->"+me.getValue());
		}
	}

	}


