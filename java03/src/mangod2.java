import java.util.Scanner;
public class mangod2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�o�O�P�y�{��");
		System.out.print("�ɿ�J�ͤ骺���");
		int mouth = scn.nextInt();
		System.out.print("�ɿ�J�ͤ骺���");
		int day = scn.nextInt();
		
		if ((mouth==1 && (day>=1 && day<=20))){
			System.out.print("���~�y         �O�@�Ӧ��p�e���H,�b�@�w���ɶ����৹���w�w���ؼ� �����̷Pı����,�ӬO��ڥh�O�� ���w���|�a�� �ʮ���j��,��Ʊ�����,�֨����k,���w�@�ӤH����");
		}else if (mouth==1 && (day>=21 && day<=31)){
			System.out.print("���~�y         ����ƨg���P�y,����Ƥl�M���`�H���� ��z��,���y���a���z�M�޿� ���ɯ�O,�A�X�R�x��t �a���g��,�O�߱B���P�y �򥻤W�O�����B�ç��Ӫ�,����R�����A�ש��� �O��b�D�q��,�B���w������O");}
		if ((mouth==2 && (day>=1 && day<=19))){
			System.out.print("���~�y          ����ƨg���P�y,����Ƥl�M���`�H���� ��z��,���y���a���z�M�޿� ���ɯ�O,�A�X�R�x��t �a���g��,�O�߱B���P�y �򥻤W�O�����B�ç��Ӫ�,����R�����A�ש��� �O��b�D�q��,�B���w������O");
		}else if (mouth==2 && (day>=20 && day<=30)){
			System.out.print("�����y          �R�۷Q,�L���B�ͥ�����z�ѥL���Q�k �ͬ����Ǧb�믫�W,�������ʸU�I��;���{��ͬ�,�h���@�w ���ͬ�,�{������n�ķũM�A��,������o�O�H�᪺�� �����y���k�ʹ�k�ʦӨ�,�O�ߥؤ����z�Q���H");}
		if ((mouth==3 && (day>=1 && day<=20))){
			System.out.print("�����y	   �R�۷Q,�L���B�ͥ�����z�ѥL���Q�k �ͬ����Ǧb�믫�W,�������ʸU�I��;���{��ͬ�,�h���@�w ���ͬ�,�{������n�ķũM�A��,������o�O�H�᪺�� �����y���k�ʹ�k�ʦӨ�,�O�ߥؤ����z�Q���H");
		}else if (mouth==3 && (day>=21 && day<=31)){
			System.out.print("�d�Ϯy	    �����B���w,�өʱj�B�k�ʤ� ���İ�,�I���q�P,���},��O�R�K �֩���ի_�I��,�}�Щʪ��ƪ� ���ۥH���O���ө� �O12�P�y��,���F�����y�~,�䥦�P�y���L�k�ҥ骺�P�y");}
		if ((mouth==4 && (day>=1 && day<=19))){
			System.out.print("�d�Ϯy	    �����B���w,�өʱj�B�k�ʤ� ���İ�,�I���q�P,���},��O�R�K �֩���ի_�I��,�}�Щʪ��ƪ� ���ۥH���O���ө� �O12�P�y��,���F�����y�~,�䥦�P�y���L�k�ҥ骺�P�y");
		}else if (mouth==4 && (day>=20 && day<=30)){
			System.out.print("�����y            �x�T,���ۤv���|�dı �I��,�өʬ~��,�N�Ӱ�w,�V���ũM �ܤְ�,�ܤֻ�,�j���R�R�a��ť�����[��O�H �����p��ܧ�,���U�@�B�o�ܺC ���U�]�O�L�Y�઺  ");}
		if ((mouth==5 && (day>=1 && day<=20))){
			System.out.print("�����y            �x�T,���ۤv���|�dı �I��,�өʬ~��,�N�Ӱ�w,�V���ũM �ܤְ�,�ܤֻ�,�j���R�R�a��ť�����[��O�H �����p��ܧ�,���U�@�B�o�ܺC ���U�]�O�L�Y�઺");
		}else if (mouth==5 && (day>=21 && day<=31)){
			System.out.print("���l�y             �㦳�����ө�,�p�ּ֩μ~��,�����ηŬX �ܥO�H�g�b���ө�,�o��,�����]���� ���ܳt�ק�,�B�g�`�ഫ���D ���u�� �����˦ۤv�ʾ����Q�k�M���� �R�ۥ�,����������N�Ѥ���");}
		if ((mouth==6 && (day>=1 && day<=21))){
			System.out.print("���l�y              �㦳�����ө�,�p�ּ֩μ~��,�����ηŬX �ܥO�H�g�b���ө�,�o��,�����]���� ���ܳt�ק�,�B�g�`�ഫ���D ���u�� �����˦ۤv�ʾ����Q�k�M���� �R�ۥ�,����������N�Ѥ���");
		}else if (mouth==6 && (day>=22 && day<=30)){
			System.out.print("���ɮy               �R�a,���� ���e�\�L�H�I�J�ۤv���a�L ���V,�`��ߨƩ�b�ߩ� �߱�����G,�`�ܤ� ���y,���x��X");}
		if ((mouth==7 && (day>=1 && day<=22))){
			System.out.print("���ɮy               �R�a,���� ���e�\�L�H�I�J�ۤv���a�L ���V,�`��ߨƩ�b�ߩ� �߱�����G,�`�ܤ� ���y,���x��X");
		}else if (mouth==7 && (day>=23 && day<=31)){
			System.out.print("��l�y                �Q���·t�M�L�� �G�_�O,�۴L�߱j,�|���ä��p�N����,���o��{���ܰ�j ���w�Q���g ���j�k�H���ɦV ���۶ƪ���");}
		if ((mouth==8 && (day>=1 && day<=22))){
			System.out.print("��l�y                �Q���·t�M�L�� �G�_�O,�۴L�߱j,�|���ä��p�N����,���o��{���ܰ�j ���w�Q���g ���j�k�H���ɦV ���۶ƪ���");
		}else if (mouth==8 && (day>=23 && day<=31)){
			System.out.print("�B�k�y                �߫�ӿ�,�ӷP���a���g�� ���w�O���D�Ϊ��F�� �㥿�q�P,�e������O�H���I �����D�q��,�n�D�ۤv�M�O�H�@�˧���");}
		if ((mouth==9 && (day>=1 && day<=22))){
			System.out.print("�B�k�y                �߫�ӿ�,�ӷP���a���g�� ���w�O���D�Ϊ��F�� �㥿�q�P,�e������O�H���I �����D�q��,�n�D�ۤv�M�O�H�@�˧���");
		}else if (mouth==9 && (day>=23 && day<=30)){
			System.out.print("�ѥ��y                  �����o��,���o�ɱ`���F �����u���g�H,�����ɩT�������� ��L�@�M�w��,���n���Z�L;���L�@�n�M�w��,�������ܥL ���󨥵� �l�D��o�ͬ�");}
		if ((mouth==10 && (day>=1 && day<=23))){
			System.out.print("�ѥ��y                  �����o��,���o�ɱ`���F �����u���g�H,�����ɩT�������� ��L�@�M�w��,���n���Z�L;���L�@�n�M�w��,�������ܥL ���󨥵� �l�D��o�ͬ�");
		}else if (mouth==10 && (day>=24 && day<=31)){
			System.out.print("���Ȯy                  ���۫H,�৹�����֦��ۧ� �ܤֻ��^�Ӫ���,�@���g���o�O�u�ߪ� �O�@�Ӽ������H,�]�O�@�ӵL�����M�I���l �O�@�ӯu���~�{���H ���^����n,�|�O�@�z��");}
		if ((mouth==11 && (day>=1 && day<=21))){
			System.out.print("���Ȯy                  ���۫H,�৹�����֦��ۧ� �ܤֻ��^�Ӫ���,�@���g���o�O�u�ߪ� �O�@�Ӽ������H,�]�O�@�ӵL�����M�I���l �O�@�ӯu���~�{���H ���^����n,�|�O�@�z��");
		}else if (mouth==11 && (day>=22 && day<=30)){
			System.out.print("�g��y                  �өʶ}��,���[ ��Ҹ��u�O����,�`�`�o�o�O�H�Ӥ����D,���j�|���� �D�`�R��,�B���q�ܤj �_�I�ʤj,�⮩�ʰ�,���q�n�� �����`���,�B�|����H���|");}
		if ((mouth==12 && (day>=1 && day<=20))){
			System.out.print("�g��y                   �өʶ}��,���[ ��Ҹ��u�O����,�`�`�o�o�O�H�Ӥ����D,���j�|���� �D�`�R��,�B���q�ܤj �_�I�ʤj,�⮩�ʰ�,���q�n�� �����`���,�B�|����H���|");
		}else if (mouth==2 && (day>=21 && day<=31)){
			System.out.print("�]�~�y                    �O�@�Ӧ��p�e���H,�b�@�w���ɶ����৹���w�w���ؼ� �����̷Pı����,�ӬO��ڥh�O�� ���w���|�a�� �ʮ���j��,��Ʊ�����,�֨����k,���w�@�ӤH����");}
		
		
	}

}

