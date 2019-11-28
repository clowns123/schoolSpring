package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;


@Data
@Component
//@AllArgsConstructor
//@RequiredArgsConstructor
public class Hotel {
	
	@Setter(onMethod_ = @Autowired)
	//@NonNull
	private Chef chef;
	
//	public Hotel(Chef chef) {
//		this.chef = chef;
//	}
}
