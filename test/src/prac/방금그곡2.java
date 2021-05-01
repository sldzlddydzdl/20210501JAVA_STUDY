package prac;

import java.util.*;

public class 방금그곡2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String m = "ABCDEFG";		
		String[] musicinfos = new String[2];
		musicinfos[0] = "12:00,12:14,HELLO,CDEFGAB";
		musicinfos[1] = "13:00,13:05,WORLD,ABCDEF";
		
		System.out.println(solution(m,musicinfos));
		

	}


	  public static String solution(String m, String[] musicinfos) {
			String mem = convertedMelody(m);
			LinkedList<Music> musics = new LinkedList<>();
			for (int i = 0; i < musicinfos.length; i++) {
				String[] t = musicinfos[i].split(",");
				Music music = new Music(i, getDiffSec(t[0], t[1]), t[2], convertedMelody(t[3]));
				if (music.totalMelody.length() >= mem.length() && music.totalMelody.contains(mem))
					musics.add(music);
			}

			if (musics.size() > 0) {
				musics.sort(new Comparator<Music>() {
					@Override
					public int compare(Music o1, Music o2) { // 재생시간 긴 순, 인덱스 작은순
						if (o2.duration == o1.duration) {
							return o1.idx - o2.idx;
						}
						return o2.duration - o1.duration;
					}

				});
				Music ans = musics.pollFirst();
				return ans.title;
			} else {
				return "(None)"; // 곡이 검색되지 않은 경우
			}
		}

		private static int getDiffSec(String t1, String t2) { // 시간차이 구하기
			String time1[] = t1.split(":");
			String time2[] = t2.split(":");
			if (time1[0].equals(time2[0])) {
				return Integer.parseInt(time2[1]) - Integer.parseInt(time1[1]);
			}
			int h = Integer.parseInt(time2[0]) - Integer.parseInt(time1[0]);
			return (60 * h + Integer.parseInt(time2[1])) - Integer.parseInt(time1[1]);
		}

		private static String convertedMelody(String m) {
			m = m.replaceAll("C#", "c");
			m = m.replaceAll("D#", "d");
			m = m.replaceAll("F#", "f");
			m = m.replaceAll("G#", "g");
			m = m.replaceAll("A#", "a");
			return m;
		}
	}

	class Music {
		int idx;
		int duration;
		String title;
		String totalMelody;

		public Music(int idx, int duration, String title, String melody) {
			super();
			this.idx = idx;
			this.duration = duration;
			this.title = title;
			this.totalMelody = makeFullMelody(melody, this.duration);
		}

		private String makeFullMelody(String me, int d) {
			if (me.length() > d)
				return me.substring(0, d);
			StringBuilder sb = new StringBuilder();
			while (sb.length() < d) {
				sb.append(me);
			}
			return sb.toString().substring(0, d);
		}

}

