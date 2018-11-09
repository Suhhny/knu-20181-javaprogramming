import java.util.*;
public class Furniture{
   static int count1, count2, count3, count4;
   public static String answer;
   static void quiz(){
   };
}

class Album extends Furniture{
   static void quiz(){
      if(count1 == 1){
         System.out.println();
         System.out.println();
         EscapeRoom.sleep(1000);
         System.out.println("여기서 얻을 수 있는 건 다 얻은 것 같다.");
         EscapeRoom.sleep(1000);
         System.out.println();
         System.out.println();
      }
      else{
         Scanner s = new Scanner(System.in);
         System.out.println();
         EscapeRoom.sleep(1000);
         System.out.println("앨범을 펼치니 쪽지 하나가 툭 떨어졌습니다. 쪽지에 무언가 적혀있습니다.");
         System.out.println();
         EscapeRoom.sleep(1000);
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println();
         System.out.println("         이 방에서 자라고 있는 곰팡이들이 보이는가? ");
         System.out.println("         이 곰팡이들은 매일 2배로 늘어나는 습성이 있다.");
         System.out.println("         만약 방 전체가 곰팡이로 덮이는 데 48일이 걸린다면,");
         System.out.println("         방의 1/4이 곰팡이로 덮이는 데에는 몇일이 걸릴까?");
         System.out.println();
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println();
         System.out.println();
         EscapeRoom.sleep(1000);
         System.out.print("정답 ( 숫자만 입력하시요. ) >> ");
         answer = s.next();
         Hp.album();
      }
   }

}

class Piano extends Furniture{
   static void quiz(){
      if(count2 == 1){
         System.out.println();
         System.out.println();
         EscapeRoom.sleep(1000);
         System.out.println("여기서 얻을 수 있는 건 다 얻은 것 같다.");
         EscapeRoom.sleep(1000);
         System.out.println();
         System.out.println();
      }
      else{
         Scanner s = new Scanner(System.in);
         System.out.println();
         EscapeRoom.sleep(1000);
         System.out.println("피아노 덮개를 여니 쪽지가 건반에 꽂혀 있습니다. 쪽지에 무언가 적혀있습니다.");
         System.out.println();
         EscapeRoom.sleep(1000);
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println();
         System.out.println("         엄마, 아빠, 아들, 딸 네가족이 사는 집 냉장고에서 한 조각 남은 피자가 사라졌다.");
         System.out.println("         네 사람중 한명이 피자를 먹었고, 한 명은 피자의 주인이다.");
         System.out.println("         그리고 남은 두 사람 중 한명은 목격자, 나머지 한 명은 공범자이다.");
         System.out.println("         다음 주어진 단서를 통해 피자 도난 사건의 범인이 누구인지 찾아라.");
         System.out.println();
         System.out.println("              1. 목격자와 공범자는 성별이 다르다.");
         System.out.println("              2. 제일 나이 많은 사람과 목격자는 성별이 다르다.");
         System.out.println("              3. 제일 어린 사람과 피자 주인은 성별이 다르다.");
         System.out.println("              4. 공범은 피자 주인보다 나이가 많다.");
         System.out.println("              5. 가족 중 아버지 나이가 제일 많다.");
         System.out.println("              6. 피자를 먹은 사람은 이 가족 중 나이가 제일 어린 사람이 아니다.");
         System.out.println();
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println();
         System.out.println();
         EscapeRoom.sleep(1000);
         System.out.print("정답 ( 엄마 / 아빠 / 아들 / 딸 ) >> ");
         answer = s.next();
         Hp.piano();
      }
   }
}

class Bed extends Furniture{
   static void quiz(){
      if(count3 == 1){
         System.out.println();
         System.out.println();
         EscapeRoom.sleep(1000);
         System.out.println("여기서 얻을 수 있는 건 다 얻은 것 같다.");
         EscapeRoom.sleep(1000);
         System.out.println();
         System.out.println();
      }
      else{
         Scanner s = new Scanner(System.in);
         System.out.println();
         EscapeRoom.sleep(1000);
         System.out.println("침대의 이불 밑을 살피니 종이 한 장이 있습니다. 종이에 무언가 적혀있습니다.");
         System.out.println();
         EscapeRoom.sleep(1000);
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println();
         System.out.println("         물음표에 들어갈 숫자는?");
         System.out.println();
         System.out.println("              1. 100 - 10 = 5");
         System.out.println("              2. 500 - 20 = 8");
         System.out.println("              3. 100 - 30 = 3");
         System.out.println("              4. 500 - 40 = 6");
         System.out.println("              5. 100 - 50 = ?");
         System.out.println();
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println();
         System.out.println();
         EscapeRoom.sleep(1000);
         System.out.print("정답 ( 숫자만 입력하시오. ) >> ");
         answer = s.next();
         Hp.bed();
      }
   }
}

class Desk extends Furniture{
   static void quiz(){
      if(count4 == 1){
         System.out.println();
         System.out.println();
         EscapeRoom.sleep(1000);
         System.out.println("여기서 얻을 수 있는 건 다 얻은 것 같다.");
         EscapeRoom.sleep(1000);
         System.out.println();
         System.out.println();
      }
      else{
         Scanner s = new Scanner(System.in);
         System.out.println();
         EscapeRoom.sleep(1000);
         System.out.println("책상서랍을 열어보니 쪽지가 들어 있습니다. 쪽지에 무언가 적혀있습니다.");
         System.out.println();
         EscapeRoom.sleep(1000);
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println();
         System.out.println("         물음표에 들어갈 숫자는?");
         System.out.println();
         System.out.println("              1. ┗ = 36");
         System.out.println("              2. ┛ = 108");
         System.out.println("              3. ┓ = 54");
         System.out.println("              4. ┏ = 18");
         System.out.println();
         System.out.println("              5. ┃ = ?");
         System.out.println();
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println();
         System.out.println();
         EscapeRoom.sleep(1000);
         System.out.print("정답 ( 숫자만 입력하시오. ) >> ");
         answer = s.next();
         Hp.desk();
      }
   }
}
