package com.te.spring.core.assignment3.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.te.spring.core.assignment3.dto.Child;

@Configuration
@Import({ CatConfig.class, CowConfig.class, DogConfig.class })
public class AllConfig {

	@Bean(name = "all")
	public Child getChildObj() {

		HashMap<String, String> friends = new HashMap<String, String>();
		friends.put("friend1", "male");
		friends.put("friend2", "female");
		friends.put("friend3", "male");

		List<String> hobbies = new ArrayList<String>();
		hobbies.add("Playing");
		hobbies.add("Painting");
		hobbies.add("Gardening");

		Set<String> subjectStudying = new HashSet<String>();
		subjectStudying.add("english");
		subjectStudying.add("maths");
		subjectStudying.add("science");

		Child child = new Child();
		child.setAge(12);
		child.setFriendsAndGender(friends);
		child.setGender("male");
		child.setHobbies(hobbies);
		child.setName("ChildName");
		child.setStandard(7);
		child.setSubjectStudying(subjectStudying);

		return child;
	}
}
