package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human {
	// コンストラクタ
	// 4. name, weaponの値を設定するために、Humanクラスに定義したコンストラクタを利用してください。
	public Wizard(String name, String weapon) {
		super(name, weapon);
		// 5. コンストラクタの中で、ヒットポイントの値は乱数を振って決定します。（乱数の具体的は範囲は後述）
		this.hp = Dice.get(120, 180);
		// 6. コンストラクタの中で、攻撃力の値は乱数を振って決定します。（乱数の具体的は範囲は後述）
		this.offensive = Dice.get(12, 18);
	}
}
