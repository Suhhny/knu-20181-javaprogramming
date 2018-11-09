public class Search{
   static void search(String a){
      switch (a){
         case "앨범":
            Album.quiz();
            break;
         case "피아노":
            Piano.quiz();
            break;
         case "침대":
            Bed.quiz();
            break;
         case "책상":
            Desk.quiz();
            break;
         case "책장": case "의자": case "쇼파": case"금고":{
            EscapeRoom.sleep(1000);
            System.out.println();
            System.out.println(a+"와 그 주변을 샅샅이 살펴보았지만 먼지만 나올 뿐 아무것도 나오지 않았습니다.");
            System.out.println();
            EscapeRoom.sleep(1000);
         }
            break;
      }
   }
}
          
