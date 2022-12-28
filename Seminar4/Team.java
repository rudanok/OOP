import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team <T extends Warrior> implements Iterable<T> {

    List<T> warriors = new ArrayList<>();
    private WarriorComandor comandor;

    public WarriorComandor getComandor() {
        return comandor;
    }

    public Team(WarriorComandor comandor) {
        this.comandor = comandor;
    }
    public void addWarriors(T newWarrior){
        warriors.add(newWarrior);
    }

    @Override
    public Iterator<T> iterator() {
        return warriors.iterator();
    }

    public int getAllDamage(){
        int sumDamage = 0;
        for (T item: warriors) {
            sumDamage+=item.getWeapon().damage();
        }
        return sumDamage;
    }

    public int getAllHealthPoint(){
        int sumHealth = 0;
        for (T item: this) {
            sumHealth+=item.getHealthpoint();
        }
        return sumHealth;
    }

    public int getMaxRadius(){
        int maxRange = 0;
        for (T item:this) {
            Weapon weapon = item.getWeapon();
            if (weapon instanceof WeaponBow){
                WeaponBow bow = (WeaponBow)weapon;
                if (maxRange< bow.range()){
                    maxRange = bow.range();
                }
            }
        }
        return maxRange;
    }

    public int minProtected(){
        int minDefense = warriors.get(0).getDefense().protection();
        for (T item:this) {
            Defense defense = item.getDefense();
            if(defense instanceof Shield){
                Shield shield = (Shield) defense;
                if(minDefense > shield.protection()){
                    minDefense = shield.protection();
                }
            }
        }
        return minDefense;
    }







}
