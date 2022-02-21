package kr.green.boot;

import org.springframework.scheduling.annotation.Scheduled;

public class MyBean {
	
	@Scheduled(fixedDelay = 5000)
    public void printMessage() {
        System.out.println("홍홍홍");
    }
	@Scheduled(fixedDelay = 3000, initialDelay = 1000)
    public void printMessage2() {
    	System.out.println("ㅋㅋㅋ");
    }
	@Scheduled(cron = "*/3 * * * * *")
    public void printMessage3() {
    	System.out.println("ㅗㅗㅗㅗ");
    }
}