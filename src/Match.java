

public class Match {

    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;
    boolean flag;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){
        if (isChech()){
            if(tossUp()){
                System.out.println("Yazı tura sonucuna göre dövüşe " + this.f1.name + " başlayacaktır..!!");
                this.flag = true;
            }
            else{
                System.out.println("Yazı tura sonucuna göre dövüşe " + this.f2.name + " başlayacaktır..!!");
                this.flag = false;
            }
            while (this.f1.health >= 0 && this.f2.health >= 0)
            {
                if(flag){
                    System.out.println("====== Yeni Round ======");
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    System.out.println(this.f1.name + " => " + this.f1.health + " canı kaldı..!!");
                    System.out.println(this.f2.name + " => " + this.f2.health + " canı kaldı..!!");
                }else{
                    System.out.println("====== Yeni Round ======");
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    System.out.println(this.f1.name + " => " + this.f1.health + " canı kaldı..!!");
                    System.out.println(this.f2.name + " => " + this.f2.health + " canı kaldı..!!");
                }

            }
        }else
            System.out.println("Boksörlerin sikletleri uyuşmuyor..!!");

    }

    boolean tossUp(){
        double randomValue = Math.random() * 100;
        return randomValue < 50;
    }

    boolean isWin(){
        if (this.f1.health == 0){
            System.out.println(this.f2.name + " müsabakayı kazandı..!!");
            return true;
        }
        if (this.f2.health == 0){
            System.out.println(this.f1.name + " müsabakayı kazandı..!!");
            return true;
        }
        else
            return false;
    }
    boolean isChech(){
        return (this.f1.weight <= maxWeight && this.f1.weight >= minWeight) && (this.f2.weight <= maxWeight && this.f2.weight >= minWeight);
    }

}
