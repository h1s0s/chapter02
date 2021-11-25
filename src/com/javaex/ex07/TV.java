package com.javaex.ex07;

public class TV {

	// 필드
	private int channel;
	private int volume;
	private boolean power;

	// 생성자
	public TV() {
		
	}
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	// 메소드 g/s
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	// 메소드 일반
	public void status() {// 채널, 볼륨, 파워를 알려주는 메소드
		System.out.println("전원:"+power+" 채널:"+channel+" 볼륨:"+volume);
	}
	public void power(boolean power) {//파워를 조작하는 메소드
		if (power==true) {
			this.power = true;
		} else if (power==false) {
			this.power = false;
		}
	}
	public void volume(int volume) {//볼륨을 조절하는 메소드(0~100)
		if(this.power==true) {
			if (volume>100) {//볼륨이 100을 넘어갈때
				this.volume = 100;
			} else if (volume<0) {//볼륨이 0보다 작을때
				this.volume = 0;
			} else {
				this.volume = volume;
			}	
		} else {
			System.out.println("전원이 꺼져 채널이 변경되지 않습니다.");
		}
	}
	public void volume(boolean up) {//볼륨을 조절하는 메소드
		if(this.power==true) {
			if (up==true) {//
				if (volume>100) {//볼륨이 100을 넘어갈때
					this.volume = 100;
				} else {
					++this.volume;
				}
			}else if (up==false) {
				if(volume<0) {//볼륨이 0보다 작을때
					this.volume = 0;
				} else {
					--this.volume;
				}
			}
		} else {
			System.out.println("전원이 꺼져 볼륨이 변경되지 않습니다.");
		}
	}
	public void channel(int channel) {
		if(channel<0) {//채널이 0보다 작다
			this.channel = 0;
		} else if(channel>255) {//채널이 255보다 크다
			this.channel = 255;
		} else {
			this.channel = channel;
		}
	}
	public void channel(boolean up) {
		if(up==true) {
			if(channel>255) {
				this.channel=255;
			} else {
				++this.channel;
			}
		} else if(up==false) {
			if(channel<0) {
				this.channel=0;
			} else {
				--this.channel;
			}
		}
	}
}
