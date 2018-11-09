import java.util.*;
import java.io.*;

class EscapeRoom{
   public static void main(String [] args){
      Scanner s = new Scanner(System.in);
      //Hp playerHp = new Hp();
      System.out.println("방탈출 게임을 시작하겠습니까? [Y/N]");
      System.out.print("=> ");

      char a = s.next().charAt(0);
      if(a=='N' || a=='n'){
         System.out.println("게임을 종료합니다.");
         return;
      }

      else if(a=='Y' || a=='y'){

				 File writeFile = new File("Answer.txt");

				 if(writeFile.exists() == true){
					 System.out.println("Answer.txt파일이 이미 존재합니다. 프로그램을 종료합니다.");
					 System.exit(1);
				 }


         sleep(1000);
         System.out.println("===========================================================================");
         System.out.printf("\n\n\n");
         System.out.println("\t\t\t\t!!GAME START!!");
         System.out.printf("\n\n\n");
         System.out.println("===========================================================================");
         sleep(1500);
         System.out.println();
         System.out.printf("당신은 지금 밀폐된 공간에 갇혔습니다.\n\n");
         sleep(1500);
         System.out.printf("하나뿐인 문은 자물쇠로 굳게 잠겨있습니다.\n\n");
         sleep(1500);
         System.out.printf("방 안을 둘러보니 평범한 방처럼 보입니다.\n\n");
         sleep(1500);
         System.out.printf("방안에는 침대, 쇼파, 피아노, 책장, 책상, 의자가 놓여있고\n\n");
         sleep(1500);
         System.out.printf("책장에는 앨범이, 책상 위에는 금고가 놓여있습니다.\n\n");
         sleep(1500);
         System.out.printf("당신은 이제부터 물건을 뒤져 숨겨져 있는 퀴즈를 찾아 풀어야 합니다.\n\n");
         sleep(1500);
         System.out.printf("퀴즈를 풀면 문에 걸린 자물쇠를 열 수 있는 숫자를 얻을 수 있습니다.\n\n");
         sleep(1500);
         System.out.printf("총 4개의 퀴즈를 찾아 풀어 숫자를 얻어내세요.\n\n");
         System.out.println("===========================================================================");
         sleep(1000);
         System.out.printf("\n\n\n\n\n");

         while (Hp.cnt<4){//물건조사
            System.out.println("어떤 물건을 살펴 보시겠습니까?[책장, 앨범, 금고, 쇼파, 침대, 책상, 의자, 피아노]");
            System.out.println();
            System.out.print("=> ");
            String what = s.next();
            Search.search(what);
            System.out.println();
            if (Hp.hp == 0){
               System.out.println("당신의 정신이 혼미해집니다...이내 아무것도 느끼지 못하게 되었습니다.");
							 System.out.printf("\n\n");
							 EscapeRoom.sleep(2000);
							 System.out.println("===========================================================================");
							 System.out.printf("\n\n\n");
							 System.out.println("\t\t\t\t~~GAME OVER~~");
							 System.out.printf("\n\n\n");
							 System.out.println("===========================================================================");
							 System.out.printf("\n\n");
 						 	 EscapeRoom.sleep(2000);
							 File readFile = new File("Hint.txt");
							 String [] st = {"", "", "", "", "", "", "", "", "", "", ""};
							 int i = 0;

							 if(readFile.exists() == false){
					     		System.out.println("score.txt파일이 없습니다. 프로그램 종료합니다.");
					     		System.exit(1);
					   	 }

							 try{
					      	Scanner s2 = new Scanner(readFile);

									while(s2.hasNext()){
	      						st[i] = s2.nextLine();
										i++;
									}

					      	s2.close();
					     }catch(FileNotFoundException fnfe){
					      	fnfe.printStackTrace();
					    }

							for(i=0; i<st.length; i++){
								System.out.println(st[i]);
							}

							System.out.println();
							System.out.println();

               return;
            }

            System.out.println();
         }


         EscapeRoom.sleep(1000);
         System.out.println("모든 단서를 다 모은 것 같다. 잠긴 문으로 가보자.");
         System.out.println();
         System.out.println();
         EscapeRoom.sleep(2000);

         Lock.last();

				 try{
      		PrintWriter pw = new PrintWriter(writeFile);
					pw.printf("\n\n");
					pw.println("탈출을 축하합니다!");
					pw.println();
					pw.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      		pw.println("앨범에서 얻은 숫자 : "+Hp.a1);
					pw.println("피아노에서 얻은 숫자 : "+Hp.a2);
					pw.println("침대에서 얻은 숫자 : "+Hp.a3);
					pw.println("책상에서 얻은 숫자 : "+Hp.a4);
					pw.println("자물쇠의 비밀번호 : "+Lock.lastAnswer);
					pw.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      		pw.close();
    		}catch(Exception e){
      		e.printStackTrace();
    		}

				System.out.println("파일 출력 완료");//이후 파일 입출력 이용

      }

      else System.out.println("Y(y) 또는 N(n)으로 입력해주십시오");

   }
   static void sleep(int time){
      try{
         Thread.sleep(time);
      }catch(InterruptedException e){}
   }

}
