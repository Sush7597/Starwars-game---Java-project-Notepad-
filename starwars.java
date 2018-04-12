import java.util.*;
class Spaceship
{
	protected int shield=30;
	protected  String weapon;
   protected	char dead;
	protected void getWeapon(int a)
	{
		
		switch(a)
		{
			case 1:weapon="GUN";
			System.out.println("YOU HAVE CHOOSEN A GUN");      
			break;
			case 2:weapon="LASER SWORD";
			System.out.println("YOU HAVE CHOOSEN A LASER SWORD");
			break;
			default:System.out.println("Wrong Input");
		}
	}
	protected void isDead()
	{
		if(shield==0)
		{
			System.out.println("    ");
			System.out.println("!!GAME OVER!!");
			System.out.println("YOU ARE DEAD..");
			dead='y';
		}
		else
		{
		    System.out.println("      ");
			System.out.println("GAME ON :-)");
			System.out.println("YOU ARE STILL ALIVE");
		}
	}
	protected void hit(int b)
	{
	Random r=new Random();
    int n=r.nextInt(2)+1;
    if(n!=b)
	{
    System.out.println("TARGET MISSED!!");
    System.out.println("SHIELD REMAINS SAME AS:"+shield);
	}
    else if(n==b)
	{
      System.out.println("TARGET SPOTTED!!");
	  if(weapon.equals("GUN"))
	  { shield-=10;
        System.out.println("REMAINING SHIELD;"+shield);
	  }		
	   else
	  {		   
        shield-=20;
		System.out.println("REMAINING SHIELD:"+shield);
	  }
	}
	
}
}
class Xwing extends Spaceship
{
	Xwing()
	{
		System.out.println("Constructor of Xwing class is invoked");
	}
}
class Tiefighter extends Spaceship
{
	Tiefighter()
	{
		System.out.println("Constructor of Tiefighter class is invoked");
	}
}
class starwars
{
	public static void main(String str[])
	{
	Scanner s=new Scanner(System.in);
	int c,d,e,f;
	Xwing X=new Xwing();
	Tiefighter T=new Tiefighter();
	System.out.println("******!!LET THE WAR BEGIN!!******");
	while((X.shield>0)||(T.shield>0))
	{
	        System.out.println("HERE COMES THE XWING FIRST");
			System.out.println("     WEAPONS AVAILABLE FOR YOU     ");
		    System.out.println("1.GUN");
		    System.out.println("2.LASER SWORD");
	        System.out.println("Enter your choice of weapon(1/2):");
	        c=s.nextInt();
	        X.getWeapon(c);
	        System.out.println("Enter Any Number(1-3)to Attack!!");
	        d=s.nextInt();
	        X.hit(d);
	        X.isDead(); 
            if(X.dead=='y')
            break;	
			System.out.println("HERE COMES THE CHANCE OF TIEFIGHTER");
			System.out.println("     WEAPONS AVAILABLE FOR YOU     ");
		    System.out.println("1.GUN");
		    System.out.println("2.LASER SWORD");
	        System.out.println("Enter Your Choice Of Weapon(1/2):");
			e=s.nextInt();
			T.getWeapon(e);
			System.out.println("Enter Any Number(1-3) To Attack:");
			f=s.nextInt();
			T.hit(f);
			T.isDead();
			if(T.dead=='y')
		    break;

	}
	}
}
