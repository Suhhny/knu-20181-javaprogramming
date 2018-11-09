import java.util.*;
public class Lock{
   static int lastAnswer = Hp.a1*Hp.a2*Hp.a3*Hp.a4;
   static void last(){
      Scanner s = new Scanner(System.in);
      System.out.println("자물쇠의 비밀번호를 푸세요.");
      EscapeRoom.sleep(1000);
      System.out.printf("\n\n\n");
      System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
      System.out.println("힌트:  ㅁXㅁXㅁXㅁ    ");
      System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
      System.out.printf("\n\n\n");
      while(true){
         System.out.print("=> ");
         int x = s.nextInt();
         if(x==lastAnswer){
            EscapeRoom.sleep(1000);
            System.out.printf("\n\n\n");
            System.out.println("자물쇠가 열렸습니다. 당신은 이제 자유입니다.");
						System.out.printf("\n\n\n");
						EscapeRoom.sleep(1000);
            break;
         }
         else{
            EscapeRoom.sleep(1000);
            System.out.printf("\n\n\n");
            System.out.println("답이 틀렸습니다.");
            EscapeRoom.sleep(1000);
            System.out.printf("\n\n\n");
            System.out.println("방 안에서 수상한 가스가 새어 나왔습니다. (체력 - 10hp)");
            EscapeRoom.sleep(1000);
            System.out.printf("\n\n\n");
            Hp.hp-=10;
            System.out.printf("현재 HP:%d\n",Hp.hp);
            System.out.printf("\n\n\n");
            EscapeRoom.sleep(1000);

            if(Hp.hp == 0){
               EscapeRoom.sleep(1000);
               System.out.printf("\n\n\n");
               System.out.println("당신의 정신이 혼미해집니다...이내 아무것도 느끼지 못하게 되었습니다.");
               EscapeRoom.sleep(1000);
               System.out.printf("\n\n\n");
               System.out.println("===========================================================================");
               System.out.printf("\n\n\n");
               System.out.println("\t\t\t\t~~GAME OVER~~");
               System.out.printf("\n\n\n");
               System.out.println("===========================================================================");
               System.out.printf("\n\n\n\n\n\n");
               return;
            }
         }
      }
   }
}
