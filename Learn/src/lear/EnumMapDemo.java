package lear;

import java.util.EnumMap;
import java.util.Map;
enum Color{��ɫ,��ɫ,��ɫ};

public class EnumMapDemo {

	public static void main(String[] args) {
		EnumMap<Color,String> eMap=new EnumMap<Color,String>(Color.class);
		eMap.put(Color.��ɫ,"Red");//���EnumMapԪ��
		eMap.put(Color.��ɫ,"Green");//��Color.��ɫ��ΪKey������Green����Ϊӳ���ֵ
		eMap.put(Color.��ɫ,"Blue");
		for(Map.Entry<Color, String>me:eMap.entrySet()){
			System.out.println(me.getKey()+"-->"+me.getValue());
		}
	}

	}


