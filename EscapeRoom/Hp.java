class Hp{
   protected static int hp=50;
   static String albumAnswer = "46";
   static String pianoAnswer = "엄마";
   static String bedAnswer = "1";
   static String deskAnswer = "72";
   static int cnt = 0;
   static int a1;
   static int a2;
   static int a3;
   static int a4;

   static void album(){
      if(Album.answer.equals(albumAnswer)){
         a1=Number.TakeNum();
         EscapeRoom.sleep(1000);
         System.out.println();
         System.out.println("정답!!");
         EscapeRoom.sleep(1000);
         System.out.println();
         System.out.println();
         System.out.println("*****************");
         System.out.println("*\t"+a1+"\t*");
         System.out.println("*****************");
         EscapeRoom.sleep(1000);
         System.out.println();
         System.out.println();
         System.out.println("숫자를 하나 얻었습니다!");
         System.out.println();
         System.out.println();
         System.out.println();
         EscapeRoom.sleep(1000);
         cnt++;
         Album.count1++;
      }
      else{
         EscapeRoom.sleep(1000);
				 System.out.println();
         System.out.println("방 안에서 수상한 가스가 새어 나왔습니다.(체력 - 10hp)");
         hp-=10;
         EscapeRoom.sleep(1000);
				 System.out.println();
         System.out.printf("현재 HP:%d\n",hp);
         EscapeRoom.sleep(1000);
      }

   }

   static void piano(){
      if(Piano.answer.equals(pianoAnswer)){
         a2=Number.TakeNum();
         EscapeRoom.sleep(1000);
         System.out.println();
         System.out.println("정답!!");
         EscapeRoom.sleep(1000);
         System.out.println();
         System.out.println();
         System.out.println("*****************");
         System.out.println("*\t"+a2+"\t*");
         System.out.println("*****************");
         EscapeRoom.sleep(1000);
         System.out.println();
         System.out.println();
         System.out.println("숫자를 하나 얻었습니다!");
         System.out.println();
         System.out.println();
         System.out.println();
         EscapeRoom.sleep(1000);
         cnt++;
         Piano.count2++;
      }
      else{
         EscapeRoom.sleep(1000);
				 System.out.println();
         System.out.println("방 안에서 수상한 가스가 새어 나왔습니다.(체력 - 10hp)");
         hp-=10;
         EscapeRoom.sleep(1000);
				 System.out.println();
         System.out.printf("현재 HP:%d\n",hp);
         EscapeRoom.sleep(1000);
      }
   }

   static void bed(){
      if(Bed.answer.equals(bedAnswer)){
         a3=Number.TakeNum();
         EscapeRoom.sleep(1000);
         System.out.println();
         System.out.println("정답!!");
         EscapeRoom.sleep(1000);
         System.out.println();
         System.out.println();
         System.out.println("*****************");
         System.out.println("*\t"+a3+"\t*");
         System.out.println("*****************");
         EscapeRoom.sleep(1000);
         System.out.println();
         System.out.println();
         System.out.println("숫자를 하나 얻었습니다!");
         System.out.println();
         System.out.println();
         System.out.println();
         EscapeRoom.sleep(1000);
         cnt++;
         Bed.count3++;
      }
      else{
         EscapeRoom.sleep(1000);
				 System.out.println();
         System.out.println("방 안에서 수상한 가스가 새어 나왔습니다.(체력 - 10hp)");
         hp-=10;
         EscapeRoom.sleep(1000);
				 System.out.println();
         System.out.printf("현재 HP:%d\n",hp);
         EscapeRoom.sleep(1000);
      }
   }

   static void desk(){
      if(Desk.answer.equals(deskAnswer)){
         a4=Number.TakeNum();
         EscapeRoom.sleep(1000);
         System.out.println();
         System.out.println("정답!!");
         EscapeRoom.sleep(1000);
         System.out.println();
         System.out.println();
         System.out.println("*****************");
         System.out.println("*\t"+a4+"\t*");
         System.out.println("*****************");
         EscapeRoom.sleep(1000);
         System.out.println();
         System.out.println();
         System.out.println("숫자를 하나 얻었습니다!");
         System.out.println();
         System.out.println();
         System.out.println();
         EscapeRoom.sleep(1000);
         cnt++;
         Desk.count4++;
      }
      else{
         EscapeRoom.sleep(1000);
				 System.out.println();
         System.out.println("방 안에서 수상한 가스가 새어 나왔습니다.(체력 - 10hp)");
         hp-=10;
         EscapeRoom.sleep(1000);
				 System.out.println();
         System.out.printf("현재 HP:%d\n",hp);
         EscapeRoom.sleep(1000);
      }
   }
}
