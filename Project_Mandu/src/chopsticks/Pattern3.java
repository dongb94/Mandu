package chopsticks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import chopsticks.Shooting;
import display.Game_stage;
/**���� ���� Ŭ����
 * @author ������
 * */
public class Pattern3 {
	/**���� ����
	 * ������ ��ġ�� ���ݾ� �����ϴ� ������ 1���� �����Ѵ�.
	 * �����ġ�� �����ֺ� ������ ��ġ�̴�.
	 * @param game ���� ȭ��
	 * */
	public Pattern3(Game_stage game) {
		ExecutorService es = Executors.newFixedThreadPool(1);
		double ran = Math.random() * 10;
		Shooting shot = new Shooting(game, (int) (425 + 600 * Math.cos(45 * ran)),
				(int) (425 + 600 * Math.sin(45 * ran)), true);
		es.execute(shot);
		es.shutdown();
	}
}