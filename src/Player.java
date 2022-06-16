import weapon.Pistol;
import weapon.Weapon;
import weapon.BigGun;
import weapon.WaterPistol;
import weapon.RPG;

public class Player {
    private Weapon[] weaponSlots;

    public Player(){
        weaponSlots = new Weapon[]{
                new BigGun(),
                new WaterPistol(),
                new Pistol(),
                new RPG()
        };
    }

    public int getSlotsCount(){  // сколько слотов у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot){
        if (slot >= getSlotsCount()){
            System.out.println("У игрока нет столько слотов оружия у него есть только " + getSlotsCount() + ", выбирите другой");
        } else if (slot < 0){
            System.out.println("значение не допустимо");

        }else {
            Weapon weapon = weaponSlots[slot];
            weapon.shot();
        }

    }
}
