package bases;

import utils.Dice;

public abstract class Human extends Living {
	// 引数をname, weapon の 2つとするコンストラクタを作成
	// Livingクラスで定義したコンストラクタを利用
	public Human(String name, String weapon) {
		super(name, weapon);
	}

	// attackメソッドをオーバーライド、コメント文の内容を実装
	@Override
	public void attack(Living target) {
		// 3-1. Living型のtargetインスタンスを「攻撃する相手のインスタンス」とします
		// ▼▼▼実装結果確認用メッセージ▼▼▼
			// System.out.println("相手の名前" + target.name);
			// System.out.println("相手のhp" + target.hp + "←★最初の表の値が引き継がれず、再取得されている");
			// System.out.println("自分の名前" + name);
			// System.out.println("自分の攻撃力" + offensive + "←★最初の表の値が引き継がれず、再取得されている");
		// ▲▲▲実装結果確認用メッセージ▲▲▲
		
		// 3-2. 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値
		int num1 = Dice.get(1, 10);
		int damage = (offensive * num1);
			// ▼▼▼実装結果確認用メッセージ▼▼▼
			// System.out.println("自分の攻撃力×サイコロ" + damage + "ダメージ");
			// ▲▲▲実装結果確認用メッセージ▲▲▲
		// 3-3. 相手のHPをダメージ値だけ減らす
		target.setHp(target.hp - damage);
			// ▼▼▼実装結果確認用メッセージ▼▼▼
			// System.out.println("（相手のHP-ダメージ）" + target.hp);
			// ▲▲▲実装結果確認用メッセージ▲▲▲
		// 3-4. 自分の攻撃力を1だけ減らす
		super.setOffensive(offensive - 1);
			// ▼▼▼実装結果確認用メッセージ▼▼▼
			//  System.out.println("自分の攻撃力(-1)" + offensive);
			// ▲▲▲実装結果確認用メッセージ▲▲▲
		// コンソールにステータスを表示
		System.out.println("\n「" + name + "」が「" + weapon + "」で攻撃！「" + target.name + "」に" + damage + "のダメージを与えた。\nしかし自分の攻撃力も1減少した。");
	}
	
}
