package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Component
@Data

//모두 주입
//@AllArgsConstructor

/* 여러개 인스턴스 변수중 특정 인스턴스 변수에 대해 의존성 자동 주입
 * @RequiredArgsConstructorm @NonNull의 쌍
 * */
@RequiredArgsConstructor
public class Restaurant {
	//어노테이션 주입
	//@Setter(onMethod_ = @Autowired)
	
	@NonNull
	private Chef chef;
//	생성자 주입
//	public Restaurant(Chef chef){
//		this.chef = chef;
//	}
	
	
}
