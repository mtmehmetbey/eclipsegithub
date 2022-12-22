

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class pus extends JPanel implements ActionListener{
	//---
	JButton buton=new JButton("HESAPLA");
	
	
	JLabel m1=new JLabel("----");
	JLabel m2=new JLabel("----");
	
	
	JLabel tutartl=new JLabel("----");
	JLabel tutarm=new JLabel("----");
	
	JTextField metinca=new JTextField("87.5");
	JTextField metingb=new JTextField("530");
	JTextField hesap=new JTextField("149");
				///nötrler
						JLabel a1=new JLabel("100M -----");   				 JLabel a2=new JLabel("TL");
						JLabel b1=new JLabel("400 CASH "); 		 		     JLabel b2=new JLabel("TL");
						JLabel c1=new JLabel("1 CASH----");				 JLabel c2=new JLabel("TL");
						JLabel d1=new JLabel("1 CASH---");				 JLabel d2=new JLabel("M");
						 JLabel dx=new JLabel("CASH G\u0130R");
						 
						 JLabel f=new JLabel("TUTAR");  JLabel f1=new JLabel("TL"); JLabel f2=new JLabel("M");  JLabel f3=new JLabel("TUTAR");
	
	///pus iconlar
		ImageIcon swicpre=new ImageIcon(getClass().getResource("/iconlar/swic.PNG"));
		ImageIcon exppre=new ImageIcon(getClass().getResource("/iconlar/exp.PNG"));				 
		ImageIcon dcpre=new ImageIcon(getClass().getResource("/iconlar/dc.PNG"));				 
		ImageIcon genie=new ImageIcon(getClass().getResource("/iconlar/genie.PNG"));				 
		ImageIcon geniehamer=new ImageIcon(getClass().getResource("/iconlar/ghamer.PNG"));				 
		ImageIcon trina=new ImageIcon(getClass().getResource("/iconlar/trina.PNG"));				 
		ImageIcon mtrina=new ImageIcon(getClass().getResource("/iconlar/mtrina.PNG"));				 
		ImageIcon warpre=new ImageIcon(getClass().getResource("/iconlar/war.PNG"));				 
		ImageIcon rebirt=new ImageIcon(getClass().getResource("/iconlar/rebirt.PNG"));				 
		ImageIcon klanname=new ImageIcon(getClass().getResource("/iconlar/klanname.PNG"));
		ImageIcon platpre=new ImageIcon(getClass().getResource("/iconlar/bronz.PNG"));				 
		ImageIcon kanat=new ImageIcon(getClass().getResource("/iconlar/dragon.PNG"));				 
		ImageIcon pazar=new ImageIcon(getClass().getResource("/iconlar/pazarsc.PNG"));
		ImageIcon buf1500=new ImageIcon(getClass().getResource("/iconlar/buf1500.PNG"));				 
		ImageIcon buf2k=new ImageIcon(getClass().getResource("/iconlar/buf2k.PNG"));				 
		ImageIcon ac350=new ImageIcon(getClass().getResource("/iconlar/ac350.PNG"));				 
		ImageIcon ac300=new ImageIcon(getClass().getResource("/iconlar/ac300.PNG"));				 
		ImageIcon ataksc=new ImageIcon(getClass().getResource("/iconlar/atak.PNG"));	
		ImageIcon dexsc=new ImageIcon(getClass().getResource("/iconlar/dex.PNG"));				 
		ImageIcon swsc=new ImageIcon(getClass().getResource("/iconlar/sw.PNG"));				 
		ImageIcon durat=new ImageIcon(getClass().getResource("/iconlar/durat.PNG"));	
		ImageIcon kardivs=new ImageIcon(getClass().getResource("/iconlar/kardiv.PNG"));				 
		ImageIcon pathos=new ImageIcon(getClass().getResource("/iconlar/pathos.PNG"));				 
		ImageIcon minerva=new ImageIcon(getClass().getResource("/iconlar/minerva.PNG"));				 
		ImageIcon ncs=new ImageIcon(getClass().getResource("/iconlar/ncs.PNG"));	
		ImageIcon otolot=new ImageIcon(getClass().getResource("/iconlar/otolot.PNG"));	
		ImageIcon vip=new ImageIcon(getClass().getResource("/iconlar/vip.PNG"));	
		ImageIcon mercent=new ImageIcon(getClass().getResource("/iconlar/mercent8li.PNG"));	
		ImageIcon hpmaestro=new ImageIcon(getClass().getResource("/iconlar/hpmaestro.PNG"));	
		ImageIcon mpmaestro=new ImageIcon(getClass().getResource("/iconlar/mpmaestro.PNG"));	
		ImageIcon seal=new ImageIcon(getClass().getResource("/iconlar/seal.PNG"));	
		ImageIcon gold=new ImageIcon(getClass().getResource("/iconlar/gold.PNG"));
		ImageIcon bronz=new ImageIcon(getClass().getResource("/iconlar/bronz.PNG"));
		ImageIcon dex=new ImageIcon(getClass().getResource("/iconlar/dex.PNG"));
		ImageIcon sw=new ImageIcon(getClass().getResource("/iconlar/sw.PNG"));
		ImageIcon atak=new ImageIcon(getClass().getResource("/iconlar/atak.PNG"));
		ImageIcon noah=new ImageIcon(getClass().getResource("/iconlar/noah.PNG"));
		ImageIcon np=new ImageIcon(getClass().getResource("/iconlar/np.PNG"));
		ImageIcon walkar=new ImageIcon(getClass().getResource("/iconlar/valkarmor.PNG"));
		ImageIcon walkhel=new ImageIcon(getClass().getResource("/iconlar/walkhel.PNG"));
		ImageIcon gryptonar=new ImageIcon(getClass().getResource("/iconlar/gryptonarmor.PNG"));
		ImageIcon gryptonhel=new ImageIcon(getClass().getResource("/iconlar/gryptonhel.PNG"));
		ImageIcon bahar=new ImageIcon(getClass().getResource("/iconlar/baharm.PNG"));
		ImageIcon bahhel=new ImageIcon(getClass().getResource("/iconlar/bahhel.PNG"));
		ImageIcon yar=new ImageIcon(getClass().getResource("/iconlar/yar.PNG"));
		ImageIcon yahel=new ImageIcon(getClass().getResource("/iconlar/yhel.PNG"));



		


JLabel swicpre1=new JLabel(swicpre);
JLabel yar1=new JLabel(yar);
JLabel yahel1=new JLabel(yahel);
JLabel walkhel1=new JLabel(walkhel);
JLabel gryptonar1=new JLabel(gryptonar);
JLabel gryptonhel1=new JLabel(gryptonhel);
JLabel bahar1=new JLabel(bahar);
JLabel bahhel1=new JLabel(bahhel);

JLabel np1=new JLabel(np);
JLabel walkar1=new JLabel(walkar);
JLabel noah1=new JLabel(noah);
JLabel atak1=new JLabel(atak);
JLabel durat11=new JLabel(durat);
JLabel mercent1=new JLabel(mercent);
JLabel sw1=new JLabel(sw);
JLabel dex1=new JLabel(dex);
JLabel bronz1=new JLabel(bronz);
JLabel gold11=new JLabel(gold);
JLabel exppre1=new JLabel(exppre);
JLabel dcpre1=new JLabel(dcpre);
JLabel genie1=new JLabel(genie);
JLabel geniehamer1=new JLabel(geniehamer);
JLabel trina1=new JLabel(trina);
JLabel mtrina1=new JLabel(mtrina);
JLabel buf15001=new JLabel(buf1500);
JLabel pazar1=new JLabel(pazar);
JLabel national=new JLabel("Swic");////////////////------
JLabel seal1=new JLabel(seal);
JLabel warpre1=new JLabel(warpre);
JLabel platpre1=new JLabel(platpre);
JLabel rebirt1=new JLabel(rebirt);
JLabel klanname1=new JLabel(klanname);
JLabel kanat1=new JLabel(kanat);
JLabel buf2k1=new JLabel(buf2k);
JLabel ac3501=new JLabel(ac350);
JLabel ac3001=new JLabel(ac300);
JLabel ataksc1=new JLabel(ataksc);
JLabel dexsc1=new JLabel(dexsc);
JLabel swsc1=new JLabel(swsc);
JLabel durat1=new JLabel(durat);
JLabel kardivs1=new JLabel(kardivs);
JLabel pathos1=new JLabel(pathos);
JLabel minerva1=new JLabel(minerva);
JLabel ncs1=new JLabel(ncs);
JLabel otolot1=new JLabel(otolot);
JLabel vip1=new JLabel(vip);
JLabel hpmaestro1=new JLabel(hpmaestro);
JLabel mpmaestro1=new JLabel(mpmaestro);
private final JLabel s1 = new JLabel("GENIE 149 NP");
private final JLabel lblSwtchPre = new JLabel("SWITCH PRE  3596 NP");
private final JLabel swi = new JLabel("35 M  ___950 TL");
private final JLabel lblDcPre = new JLabel("DC PRE 2159 NP");
private final JLabel lblExpPre = new JLabel("EXP PRE 2796 NP");
private final JLabel lblWarPre = new JLabel("WAR PRE 2599 NP");
private final JLabel lblPlatPrenp = new JLabel("PLAT PRE 2796NP");
private final JLabel lblGoldPre = new JLabel("GOLD PRE 1996 NP");
private final JLabel lblBronzPre = new JLabel("BRONZ PRE 716 NP");
private final JLabel lblClanName = new JLabel("CLAN NAME  399 NP");
private final JLabel lblBronzPre_2 = new JLabel("M\u0130NERVA  729 NP");
private final JLabel lblPathosNp = new JLabel("PATHOS  479 NP");
private final JLabel lblTrnaNp = new JLabel("TRINA 800 NP");
private final JLabel lblMtrnaNp = new JLabel("MTRINA 959 NP");
private final JLabel lblPazarSc = new JLabel("PAZAR SC 360 NP");
private final JLabel lblKanatNp = new JLabel("KANAT 899 NP");
private final JLabel lblOtolotNp = new JLabel("OTOLOT 248 NP");
private final JLabel lblNcsNp = new JLabel("NCS 1599 NP");
private final JLabel lblKrdvsNp = new JLabel("KARDIVS 400 NP");
private final JLabel lblAc = new JLabel("AC 350  249 NP");
private final JLabel lblAc_1 = new JLabel("AC  300  149 NP");
private final JLabel lblDexSc = new JLabel("DEX SC 169 NP");
private final JLabel lblkHp = new JLabel("2K HP  249 NP");
private final JLabel lblHp = new JLabel("HP 1500   149 NP");
private final JLabel lblGhammerNp = new JLabel("GHAMMER 99 NP");
private final JLabel lblHpMaest = new JLabel("HP MAEST 200 NP");
private final JLabel lblMpMaest = new JLabel("MP MAEST 200 NP");
private final JLabel lblRebrthSc = new JLabel("REBIRTH SC 249 NP");
private final JLabel s1_17 = new JLabel("WALKRYARM 429 NP");
private final JLabel lblNpSc = new JLabel("NP SC 799 NP");
private final JLabel lblNoahSc = new JLabel("NOAH SC 149 NP");
private final JLabel lblAtakSc = new JLabel("ATAK SC 159 NP");
private final JLabel s1_21 = new JLabel("V\u0130P VAULT  349 NP");
private final JLabel lblDuratNp = new JLabel("DURAT 59 NP");
private final JLabel lblMercentNp = new JLabel("MERCENT 159 NP");
private final JLabel lblSealNp = new JLabel("SEAL 2800 NP");
private final JLabel lblSwSc = new JLabel("SW SC  79 NP");
private final JLabel s1_26 = new JLabel("WALKRY HEL 349 NP");
private final JLabel s1_27 = new JLabel("GRYPTON HEL 349 NP");
private final JLabel s1_28 = new JLabel("GRYPTON ARMOR 429 NP");
private final JLabel s1_29 = new JLabel("BAHAMUT ARMOR 429 NP");
private final JLabel s1_30 = new JLabel("BAHAMUT HEL 349 NP");
private final JLabel lblYeneriArmor = new JLabel("YENI\u00C7ER\u0130 ARMOR 429 NP");
private final JLabel lblYeniceriArmor = new JLabel("YENI\u00C7ER\u0130 HELMET 349 NP");
private final JLabel gen = new JLabel("35 M  ___950 TL");
private final JLabel tri = new JLabel("35 M  ___950 TL");
private final JLabel mtri = new JLabel("35 M  ___950 TL");
private final JLabel paz = new JLabel("35 M  ___950 TL");
private final JLabel kan = new JLabel("35 M  ___950 TL");
private final JLabel oto = new JLabel("35 M  ___950 TL");
private final JLabel dc = new JLabel("35 M  ___950 TL");
private final JLabel exp = new JLabel("35 M  ___950 TL");
private final JLabel wa = new JLabel("35 M  ___950 TL");
private final JLabel pla = new JLabel("35 M  ___950 TL");
private final JLabel nc = new JLabel("35 M  ___950 TL");
private final JLabel gol = new JLabel("35 M  ___950 TL");
private final JLabel bro = new JLabel("35 M  ___950 TL");
private final JLabel cla = new JLabel("35 M  ___950 TL");
private final JLabel min = new JLabel("35 M  ___950 TL");
private final JLabel pat = new JLabel("35 M  ___950 TL");
private final JLabel kar = new JLabel("35 M  ___950 TL");
private final JLabel ac35 = new JLabel("35 M  ___950 TL");
private final JLabel ac30 = new JLabel("35 M  ___950 TL");
private final JLabel de = new JLabel("35 M  ___950 TL");
private final JLabel k2 = new JLabel("35 M  ___950 TL");
private final JLabel k15 = new JLabel("35 M  ___950 TL");
private final JLabel gha = new JLabel("35 M  ___950 TL");
private final JLabel hpm = new JLabel("35 M  ___950 TL");
private final JLabel mpm = new JLabel("35 M  ___950 TL");
private final JLabel reb = new JLabel("35 M  ___950 TL");
private final JLabel swscc = new JLabel("35 M  ___950 TL");
private final JLabel sea = new JLabel("35 M  ___950 TL");
private final JLabel mer = new JLabel("35 M  ___950 TL");
private final JLabel dur = new JLabel("35 M  ___950 TL");
private final JLabel vi = new JLabel("35 M  ___950 TL");
private final JLabel at = new JLabel("35 M  ___950 TL");
private final JLabel noa = new JLabel("35 M  ___950 TL");
private final JLabel npsc = new JLabel("35 M  ___950 TL");
private final JLabel ww1 = new JLabel("35 M  ___950 TL");
private final JLabel yy2 = new JLabel("35 M  ___950 TL");
private final JLabel yy1 = new JLabel("35 M  ___950 TL");
private final JLabel bb2 = new JLabel("35 M  ___950 TL");
private final JLabel bb1 = new JLabel("35 M  ___950 TL");
private final JLabel gg1 = new JLabel("35 M  ___950 TL");
private final JLabel gg2 = new JLabel("35 M  ___950 TL");
private final JLabel ww2 = new JLabel("35 M  ___950 TL");



						 
						
	
	public pus() {
		setBackground(new Color(0, 0, 0));
		
		
		

	
		SpringLayout spring =new SpringLayout();
		spring.putConstraint(SpringLayout.NORTH, yy1, 3, SpringLayout.NORTH, lblHpMaest);
		spring.putConstraint(SpringLayout.WEST, yy1, 29, SpringLayout.EAST, yar1);
		spring.putConstraint(SpringLayout.WEST, lblYeneriArmor, 18, SpringLayout.EAST, yar1);
		spring.putConstraint(SpringLayout.NORTH, yar1, 17, SpringLayout.SOUTH, bahhel1);
		spring.putConstraint(SpringLayout.WEST, yar1, 0, SpringLayout.WEST, bahar1);
		spring.putConstraint(SpringLayout.SOUTH, yar1, 0, SpringLayout.SOUTH, platpre1);
		spring.putConstraint(SpringLayout.EAST, yar1, 0, SpringLayout.EAST, yahel1);
		spring.putConstraint(SpringLayout.WEST, yy2, 18, SpringLayout.EAST, yahel1);
		spring.putConstraint(SpringLayout.WEST, lblYeniceriArmor, 18, SpringLayout.EAST, yahel1);
		spring.putConstraint(SpringLayout.WEST, yahel1, 0, SpringLayout.WEST, bahar1);
		spring.putConstraint(SpringLayout.EAST, yahel1, -12, SpringLayout.EAST, walkhel1);
		spring.putConstraint(SpringLayout.NORTH, lblYeneriArmor, 0, SpringLayout.NORTH, noah1);
		spring.putConstraint(SpringLayout.NORTH, lblYeniceriArmor, -3, SpringLayout.NORTH, paz);
		spring.putConstraint(SpringLayout.SOUTH, yy2, 0, SpringLayout.SOUTH, np1);
		spring.putConstraint(SpringLayout.NORTH, yahel1, 11, SpringLayout.NORTH, klanname1);
		spring.putConstraint(SpringLayout.NORTH, kan, 551, SpringLayout.NORTH, this);
		spring.putConstraint(SpringLayout.NORTH, durat1, 551, SpringLayout.NORTH, this);
		spring.putConstraint(SpringLayout.SOUTH, lblKanatNp, -6, SpringLayout.NORTH, kan);
		spring.putConstraint(SpringLayout.SOUTH, durat1, -98, SpringLayout.SOUTH, this);
		spring.putConstraint(SpringLayout.SOUTH, yahel1, -6, SpringLayout.NORTH, durat1);
		spring.putConstraint(SpringLayout.NORTH, gol, 7, SpringLayout.SOUTH, lblGoldPre);
		spring.putConstraint(SpringLayout.NORTH, tri, 3, SpringLayout.SOUTH, lblTrnaNp);
		spring.putConstraint(SpringLayout.SOUTH, tri, -24, SpringLayout.NORTH, lblMtrnaNp);
		spring.putConstraint(SpringLayout.WEST, tri, 6, SpringLayout.EAST, trina1);
		spring.putConstraint(SpringLayout.EAST, tri, -21, SpringLayout.WEST, bronz1);
		spring.putConstraint(SpringLayout.WEST, trina1, 11, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.EAST, trina1, -1297, SpringLayout.EAST, this);
		spring.putConstraint(SpringLayout.WEST, lblTrnaNp, 6, SpringLayout.EAST, trina1);
		spring.putConstraint(SpringLayout.SOUTH, lblTrnaNp, 0, SpringLayout.SOUTH, buf15001);
		spring.putConstraint(SpringLayout.WEST, s1, 71, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.WEST, genie1, 11, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.EAST, genie1, -6, SpringLayout.WEST, s1);
		spring.putConstraint(SpringLayout.NORTH, trina1, 6, SpringLayout.SOUTH, genie1);
		spring.putConstraint(SpringLayout.NORTH, gen, 0, SpringLayout.NORTH, ncs1);
		spring.putConstraint(SpringLayout.WEST, gen, 6, SpringLayout.EAST, genie1);
		spring.putConstraint(SpringLayout.NORTH, buf2k1, 2, SpringLayout.SOUTH, dex1);
		spring.putConstraint(SpringLayout.SOUTH, buf2k1, -2, SpringLayout.NORTH, buf15001);
		spring.putConstraint(SpringLayout.NORTH, s1, 0, SpringLayout.NORTH, genie1);
		spring.putConstraint(SpringLayout.EAST, s1, -21, SpringLayout.WEST, gold11);
		spring.putConstraint(SpringLayout.WEST, lblKanatNp, 71, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.WEST, lblPazarSc, 71, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.WEST, lblMtrnaNp, 71, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.WEST, otolot1, 11, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.EAST, otolot1, -6, SpringLayout.WEST, lblOtolotNp);
		spring.putConstraint(SpringLayout.WEST, kanat1, 11, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.EAST, kanat1, -6, SpringLayout.WEST, lblKanatNp);
		spring.putConstraint(SpringLayout.WEST, pazar1, 11, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.EAST, pazar1, -6, SpringLayout.WEST, lblPazarSc);
		spring.putConstraint(SpringLayout.WEST, mtrina1, 11, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.EAST, mtrina1, -6, SpringLayout.WEST, lblMtrnaNp);
		spring.putConstraint(SpringLayout.SOUTH, trina1, -10, SpringLayout.NORTH, mtrina1);
		spring.putConstraint(SpringLayout.NORTH, genie1, 0, SpringLayout.NORTH, pla);
		spring.putConstraint(SpringLayout.SOUTH, genie1, -20, SpringLayout.SOUTH, ncs1);
		spring.putConstraint(SpringLayout.NORTH, vi, 6, SpringLayout.SOUTH, s1_21);
		spring.putConstraint(SpringLayout.WEST, vi, 6, SpringLayout.EAST, vip1);
		spring.putConstraint(SpringLayout.WEST, bahar1, 70, SpringLayout.EAST, s1_21);
		spring.putConstraint(SpringLayout.EAST, bahar1, -6, SpringLayout.WEST, s1_29);
		spring.putConstraint(SpringLayout.NORTH, k2, 260, SpringLayout.NORTH, this);
		spring.putConstraint(SpringLayout.WEST, s1_29, 1102, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, bb1, 9, SpringLayout.SOUTH, s1_29);
		spring.putConstraint(SpringLayout.NORTH, s1_21, 48, SpringLayout.SOUTH, mer);
		spring.putConstraint(SpringLayout.WEST, s1_21, 6, SpringLayout.EAST, vip1);
		spring.putConstraint(SpringLayout.NORTH, mercent1, 22, SpringLayout.SOUTH, seal1);
		spring.putConstraint(SpringLayout.SOUTH, mercent1, -31, SpringLayout.NORTH, vip1);
		spring.putConstraint(SpringLayout.NORTH, vip1, 0, SpringLayout.NORTH, gold11);
		spring.putConstraint(SpringLayout.WEST, vip1, 0, SpringLayout.WEST, sw1);
		spring.putConstraint(SpringLayout.SOUTH, vip1, -23, SpringLayout.NORTH, atak1);
		spring.putConstraint(SpringLayout.EAST, vip1, 0, SpringLayout.EAST, sw1);
		spring.putConstraint(SpringLayout.WEST, s1_27, 1102, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.WEST, lblSealNp, 5, SpringLayout.EAST, seal1);
		spring.putConstraint(SpringLayout.WEST, gryptonar1, 68, SpringLayout.EAST, sea);
		spring.putConstraint(SpringLayout.EAST, gryptonar1, -6, SpringLayout.WEST, s1_27);
		spring.putConstraint(SpringLayout.NORTH, seal1, 0, SpringLayout.NORTH, dcpre1);
		spring.putConstraint(SpringLayout.WEST, seal1, 0, SpringLayout.WEST, sw1);
		spring.putConstraint(SpringLayout.SOUTH, seal1, 58, SpringLayout.NORTH, dcpre1);
		spring.putConstraint(SpringLayout.EAST, seal1, 1, SpringLayout.EAST, sw1);
		spring.putConstraint(SpringLayout.WEST, lblMercentNp, 6, SpringLayout.EAST, mercent1);
		spring.putConstraint(SpringLayout.SOUTH, lblMercentNp, 0, SpringLayout.SOUTH, exppre1);
		spring.putConstraint(SpringLayout.WEST, gryptonhel1, 65, SpringLayout.EAST, mer);
		spring.putConstraint(SpringLayout.EAST, gryptonhel1, -6, SpringLayout.WEST, s1_28);
		spring.putConstraint(SpringLayout.WEST, mer, 6, SpringLayout.EAST, mercent1);
		spring.putConstraint(SpringLayout.SOUTH, mer, 0, SpringLayout.SOUTH, mercent1);
		spring.putConstraint(SpringLayout.SOUTH, atak1, -337, SpringLayout.SOUTH, this);
		spring.putConstraint(SpringLayout.WEST, s1_28, 1102, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, lblDexSc, 0, SpringLayout.SOUTH, ac30);
		spring.putConstraint(SpringLayout.WEST, mercent1, 0, SpringLayout.WEST, sw1);
		spring.putConstraint(SpringLayout.EAST, mercent1, 3, SpringLayout.EAST, sw1);
		spring.putConstraint(SpringLayout.NORTH, dur, 0, SpringLayout.NORTH, pathos1);
		spring.putConstraint(SpringLayout.EAST, dur, 0, SpringLayout.EAST, bb2);
		spring.putConstraint(SpringLayout.WEST, lblDuratNp, 6, SpringLayout.EAST, durat1);
		spring.putConstraint(SpringLayout.SOUTH, lblDuratNp, 0, SpringLayout.SOUTH, minerva1);
		spring.putConstraint(SpringLayout.WEST, durat1, 0, SpringLayout.WEST, walkhel1);
		spring.putConstraint(SpringLayout.EAST, durat1, 0, SpringLayout.EAST, walkhel1);
		spring.putConstraint(SpringLayout.NORTH, atak1, 324, SpringLayout.NORTH, this);
		spring.putConstraint(SpringLayout.NORTH, de, 6, SpringLayout.SOUTH, lblDexSc);
		spring.putConstraint(SpringLayout.SOUTH, lblkHp, -6, SpringLayout.NORTH, k2);
		spring.putConstraint(SpringLayout.WEST, atak1, 69, SpringLayout.EAST, k15);
		spring.putConstraint(SpringLayout.EAST, atak1, -3, SpringLayout.WEST, lblAtakSc);
		spring.putConstraint(SpringLayout.NORTH, ww2, 0, SpringLayout.NORTH, metinca);
		spring.putConstraint(SpringLayout.WEST, ww2, 6, SpringLayout.EAST, walkhel1);
		spring.putConstraint(SpringLayout.WEST, gg2, 6, SpringLayout.EAST, gryptonar1);
		spring.putConstraint(SpringLayout.SOUTH, gg2, 0, SpringLayout.SOUTH, m2);
		spring.putConstraint(SpringLayout.WEST, gg1, 6, SpringLayout.EAST, gryptonhel1);
		spring.putConstraint(SpringLayout.SOUTH, gg1, 0, SpringLayout.SOUTH, f);
		spring.putConstraint(SpringLayout.WEST, bb1, 6, SpringLayout.EAST, bahar1);
		spring.putConstraint(SpringLayout.WEST, bb2, 6, SpringLayout.EAST, bahhel1);
		spring.putConstraint(SpringLayout.SOUTH, bb2, 0, SpringLayout.SOUTH, ncs1);
		spring.putConstraint(SpringLayout.NORTH, ww1, 3, SpringLayout.NORTH, lblPathosNp);
		spring.putConstraint(SpringLayout.WEST, ww1, 6, SpringLayout.EAST, walkar1);
		spring.putConstraint(SpringLayout.NORTH, npsc, 0, SpringLayout.NORTH, mpmaestro1);
		spring.putConstraint(SpringLayout.EAST, npsc, 0, SpringLayout.EAST, lblNoahSc);
		spring.putConstraint(SpringLayout.WEST, noa, 6, SpringLayout.EAST, noah1);
		spring.putConstraint(SpringLayout.SOUTH, noa, 0, SpringLayout.SOUTH, lblHpMaest);
		spring.putConstraint(SpringLayout.NORTH, at, 0, SpringLayout.NORTH, bronz1);
		spring.putConstraint(SpringLayout.WEST, at, 6, SpringLayout.EAST, atak1);
		spring.putConstraint(SpringLayout.NORTH, sea, 0, SpringLayout.NORTH, gryptonar1);
		spring.putConstraint(SpringLayout.EAST, sea, 0, SpringLayout.EAST, lblNoahSc);
		spring.putConstraint(SpringLayout.NORTH, swscc, 6, SpringLayout.SOUTH, lblSwSc);
		spring.putConstraint(SpringLayout.EAST, swscc, 0, SpringLayout.EAST, lblNoahSc);
		spring.putConstraint(SpringLayout.NORTH, reb, 6, SpringLayout.SOUTH, lblRebrthSc);
		spring.putConstraint(SpringLayout.WEST, reb, 6, SpringLayout.EAST, rebirt1);
		spring.putConstraint(SpringLayout.NORTH, mpm, 0, SpringLayout.NORTH, minerva1);
		spring.putConstraint(SpringLayout.EAST, mpm, 0, SpringLayout.EAST, lblKrdvsNp);
		spring.putConstraint(SpringLayout.NORTH, hpm, 6, SpringLayout.SOUTH, lblHpMaest);
		spring.putConstraint(SpringLayout.WEST, hpm, 6, SpringLayout.EAST, hpmaestro1);
		spring.putConstraint(SpringLayout.NORTH, gha, 0, SpringLayout.NORTH, noah1);
		spring.putConstraint(SpringLayout.EAST, gha, 0, SpringLayout.EAST, lblKrdvsNp);
		spring.putConstraint(SpringLayout.WEST, k15, 6, SpringLayout.EAST, buf15001);
		spring.putConstraint(SpringLayout.SOUTH, k15, 0, SpringLayout.SOUTH, ncs1);
		spring.putConstraint(SpringLayout.EAST, k2, 0, SpringLayout.EAST, lblKrdvsNp);
		spring.putConstraint(SpringLayout.EAST, de, 0, SpringLayout.EAST, lblKrdvsNp);
		spring.putConstraint(SpringLayout.SOUTH, ac30, 0, SpringLayout.SOUTH, buton);
		spring.putConstraint(SpringLayout.EAST, ac30, 0, SpringLayout.EAST, lblKrdvsNp);
		spring.putConstraint(SpringLayout.NORTH, ac35, 0, SpringLayout.NORTH, gryptonar1);
		spring.putConstraint(SpringLayout.WEST, ac35, 6, SpringLayout.EAST, ac3501);
		spring.putConstraint(SpringLayout.NORTH, kar, 6, SpringLayout.SOUTH, lblKrdvsNp);
		spring.putConstraint(SpringLayout.EAST, kar, 0, SpringLayout.EAST, lblKrdvsNp);
		spring.putConstraint(SpringLayout.WEST, lblBronzPre, 0, SpringLayout.WEST, wa);
		spring.putConstraint(SpringLayout.EAST, lblBronzPre, 148, SpringLayout.WEST, wa);
		spring.putConstraint(SpringLayout.NORTH, pat, 6, SpringLayout.SOUTH, lblPathosNp);
		spring.putConstraint(SpringLayout.EAST, pat, 0, SpringLayout.EAST, swi);
		spring.putConstraint(SpringLayout.WEST, min, 0, SpringLayout.WEST, lblClanName);
		spring.putConstraint(SpringLayout.SOUTH, min, -6, SpringLayout.NORTH, pathos1);
		spring.putConstraint(SpringLayout.NORTH, cla, 0, SpringLayout.NORTH, mpmaestro1);
		spring.putConstraint(SpringLayout.WEST, cla, 6, SpringLayout.EAST, klanname1);
		spring.putConstraint(SpringLayout.NORTH, bro, 0, SpringLayout.NORTH, hpmaestro1);
		spring.putConstraint(SpringLayout.EAST, bro, 0, SpringLayout.EAST, swi);
		spring.putConstraint(SpringLayout.EAST, gol, 0, SpringLayout.EAST, swi);
		spring.putConstraint(SpringLayout.NORTH, nc, 0, SpringLayout.NORTH, atak1);
		spring.putConstraint(SpringLayout.EAST, nc, 0, SpringLayout.EAST, swi);
		spring.putConstraint(SpringLayout.SOUTH, pla, 0, SpringLayout.SOUTH, gold11);
		spring.putConstraint(SpringLayout.EAST, pla, 0, SpringLayout.EAST, swi);
		spring.putConstraint(SpringLayout.NORTH, wa, 0, SpringLayout.NORTH, f2);
		spring.putConstraint(SpringLayout.EAST, wa, 0, SpringLayout.EAST, lblExpPre);
		spring.putConstraint(SpringLayout.NORTH, exp, 0, SpringLayout.NORTH, buton);
		spring.putConstraint(SpringLayout.WEST, exp, 6, SpringLayout.EAST, exppre1);
		spring.putConstraint(SpringLayout.NORTH, dc, 0, SpringLayout.NORTH, gryptonar1);
		spring.putConstraint(SpringLayout.EAST, dc, 0, SpringLayout.EAST, swi);
		spring.putConstraint(SpringLayout.NORTH, oto, 6, SpringLayout.SOUTH, lblOtolotNp);
		spring.putConstraint(SpringLayout.WEST, oto, 6, SpringLayout.EAST, otolot1);
		spring.putConstraint(SpringLayout.WEST, kan, 6, SpringLayout.EAST, kanat1);
		spring.putConstraint(SpringLayout.NORTH, paz, 0, SpringLayout.SOUTH, lblPazarSc);
		spring.putConstraint(SpringLayout.WEST, paz, 6, SpringLayout.EAST, pazar1);
		spring.putConstraint(SpringLayout.NORTH, mtri, 0, SpringLayout.NORTH, hpmaestro1);
		spring.putConstraint(SpringLayout.WEST, mtri, 6, SpringLayout.EAST, mtrina1);
		spring.putConstraint(SpringLayout.NORTH, lblNcsNp, 0, SpringLayout.NORTH, ncs1);
		spring.putConstraint(SpringLayout.WEST, lblNcsNp, 6, SpringLayout.EAST, ncs1);
		spring.putConstraint(SpringLayout.NORTH, lblPathosNp, 0, SpringLayout.NORTH, pathos1);
		spring.putConstraint(SpringLayout.WEST, lblPathosNp, 0, SpringLayout.WEST, lblPlatPrenp);
		spring.putConstraint(SpringLayout.NORTH, lblNoahSc, 0, SpringLayout.NORTH, noah1);
		spring.putConstraint(SpringLayout.WEST, lblNoahSc, 6, SpringLayout.EAST, noah1);
		spring.putConstraint(SpringLayout.NORTH, s1_30, 0, SpringLayout.NORTH, ncs1);
		spring.putConstraint(SpringLayout.WEST, s1_30, 6, SpringLayout.EAST, bahhel1);
		spring.putConstraint(SpringLayout.NORTH, s1_29, 0, SpringLayout.NORTH, bahar1);
		spring.putConstraint(SpringLayout.SOUTH, s1_28, 0, SpringLayout.SOUTH, exppre1);
		spring.putConstraint(SpringLayout.NORTH, s1_27, 0, SpringLayout.NORTH, gryptonar1);
		spring.putConstraint(SpringLayout.NORTH, s1_26, 0, SpringLayout.NORTH, swicpre1);
		spring.putConstraint(SpringLayout.WEST, s1_26, 6, SpringLayout.EAST, walkhel1);
		spring.putConstraint(SpringLayout.NORTH, lblSwSc, 0, SpringLayout.NORTH, kardivs1);
		spring.putConstraint(SpringLayout.WEST, lblSwSc, 6, SpringLayout.EAST, sw1);
		spring.putConstraint(SpringLayout.NORTH, lblSealNp, 0, SpringLayout.NORTH, dcpre1);
		spring.putConstraint(SpringLayout.WEST, lblAtakSc, 0, SpringLayout.WEST, lblNpSc);
		spring.putConstraint(SpringLayout.SOUTH, lblAtakSc, 0, SpringLayout.SOUTH, ncs1);
		spring.putConstraint(SpringLayout.NORTH, lblNpSc, 0, SpringLayout.NORTH, klanname1);
		spring.putConstraint(SpringLayout.WEST, lblNpSc, 6, SpringLayout.EAST, np1);
		spring.putConstraint(SpringLayout.WEST, s1_17, 6, SpringLayout.EAST, walkar1);
		spring.putConstraint(SpringLayout.SOUTH, s1_17, 0, SpringLayout.SOUTH, mpmaestro1);
		spring.putConstraint(SpringLayout.NORTH, lblRebrthSc, 0, SpringLayout.NORTH, rebirt1);
		spring.putConstraint(SpringLayout.WEST, lblRebrthSc, 5, SpringLayout.EAST, rebirt1);
		spring.putConstraint(SpringLayout.WEST, lblMpMaest, 4, SpringLayout.EAST, mpmaestro1);
		spring.putConstraint(SpringLayout.SOUTH, lblMpMaest, 0, SpringLayout.SOUTH, klanname1);
		spring.putConstraint(SpringLayout.NORTH, lblHpMaest, 0, SpringLayout.NORTH, hpmaestro1);
		spring.putConstraint(SpringLayout.WEST, lblHpMaest, 6, SpringLayout.EAST, hpmaestro1);
		spring.putConstraint(SpringLayout.WEST, lblGhammerNp, 6, SpringLayout.EAST, geniehamer1);
		spring.putConstraint(SpringLayout.SOUTH, lblGhammerNp, 0, SpringLayout.SOUTH, atak1);
		spring.putConstraint(SpringLayout.NORTH, lblHp, 0, SpringLayout.NORTH, ncs1);
		spring.putConstraint(SpringLayout.WEST, lblHp, 8, SpringLayout.EAST, buf15001);
		spring.putConstraint(SpringLayout.WEST, lblkHp, 6, SpringLayout.EAST, dex1);
		spring.putConstraint(SpringLayout.WEST, lblDexSc, 5, SpringLayout.EAST, ac3001);
		spring.putConstraint(SpringLayout.NORTH, lblAc_1, 0, SpringLayout.NORTH, ac3001);
		spring.putConstraint(SpringLayout.WEST, lblAc_1, 9, SpringLayout.EAST, ac3001);
		spring.putConstraint(SpringLayout.NORTH, lblAc, 0, SpringLayout.NORTH, dcpre1);
		spring.putConstraint(SpringLayout.WEST, lblAc, 6, SpringLayout.EAST, ac3501);
		spring.putConstraint(SpringLayout.NORTH, lblKrdvsNp, 0, SpringLayout.NORTH, kardivs1);
		spring.putConstraint(SpringLayout.WEST, lblKrdvsNp, 6, SpringLayout.EAST, kardivs1);
		spring.putConstraint(SpringLayout.NORTH, lblOtolotNp, 0, SpringLayout.NORTH, pathos1);
		spring.putConstraint(SpringLayout.WEST, lblOtolotNp, 6, SpringLayout.EAST, kanat1);
		spring.putConstraint(SpringLayout.SOUTH, lblPazarSc, 0, SpringLayout.SOUTH, lblClanName);
		spring.putConstraint(SpringLayout.SOUTH, lblMtrnaNp, 0, SpringLayout.SOUTH, geniehamer1);
		spring.putConstraint(SpringLayout.NORTH, lblBronzPre_2, 0, SpringLayout.NORTH, minerva1);
		spring.putConstraint(SpringLayout.WEST, lblBronzPre_2, 6, SpringLayout.EAST, minerva1);
		spring.putConstraint(SpringLayout.NORTH, lblClanName, 0, SpringLayout.NORTH, klanname1);
		spring.putConstraint(SpringLayout.EAST, lblClanName, 0, SpringLayout.EAST, lblGoldPre);
		spring.putConstraint(SpringLayout.NORTH, bahhel1, 304, SpringLayout.NORTH, this);
		spring.putConstraint(SpringLayout.SOUTH, bahhel1, -351, SpringLayout.SOUTH, this);
		spring.putConstraint(SpringLayout.NORTH, gryptonar1, 11, SpringLayout.SOUTH, walkhel1);
		spring.putConstraint(SpringLayout.SOUTH, gryptonar1, -6, SpringLayout.NORTH, gryptonhel1);
		spring.putConstraint(SpringLayout.EAST, walkhel1, 0, SpringLayout.EAST, gryptonar1);
		spring.putConstraint(SpringLayout.WEST, walkhel1, 200, SpringLayout.EAST, sw1);
		spring.putConstraint(SpringLayout.NORTH, bahar1, 6, SpringLayout.SOUTH, gryptonhel1);
		spring.putConstraint(SpringLayout.SOUTH, bahar1, -9, SpringLayout.NORTH, bahhel1);
		spring.putConstraint(SpringLayout.WEST, bahhel1, 204, SpringLayout.EAST, atak1);
		spring.putConstraint(SpringLayout.EAST, bahhel1, -266, SpringLayout.EAST, this);
		spring.putConstraint(SpringLayout.NORTH, gryptonhel1, 163, SpringLayout.NORTH, this);
		spring.putConstraint(SpringLayout.SOUTH, gryptonhel1, -498, SpringLayout.SOUTH, this);
		spring.putConstraint(SpringLayout.NORTH, walkhel1, 0, SpringLayout.NORTH, swicpre1);
		spring.putConstraint(SpringLayout.SOUTH, walkhel1, 6, SpringLayout.SOUTH, metinca);
		spring.putConstraint(SpringLayout.NORTH, walkar1, 6, SpringLayout.SOUTH, np1);
		spring.putConstraint(SpringLayout.WEST, walkar1, 0, SpringLayout.WEST, sw1);
		spring.putConstraint(SpringLayout.SOUTH, walkar1, 86, SpringLayout.SOUTH, np1);
		spring.putConstraint(SpringLayout.EAST, walkar1, 70, SpringLayout.WEST, sw1);
		spring.putConstraint(SpringLayout.NORTH, np1, 0, SpringLayout.NORTH, klanname1);
		spring.putConstraint(SpringLayout.EAST, np1, 0, SpringLayout.EAST, sw1);
		spring.putConstraint(SpringLayout.NORTH, noah1, 6, SpringLayout.SOUTH, atak1);
		spring.putConstraint(SpringLayout.EAST, noah1, 0, SpringLayout.EAST, sw1);
		spring.putConstraint(SpringLayout.NORTH, sw1, 0, SpringLayout.NORTH, kardivs1);
		spring.putConstraint(SpringLayout.WEST, sw1, 201, SpringLayout.EAST, kardivs1);
		spring.putConstraint(SpringLayout.SOUTH, sw1, 52, SpringLayout.NORTH, kardivs1);
		spring.putConstraint(SpringLayout.EAST, sw1, 268, SpringLayout.EAST, kardivs1);
		spring.putConstraint(SpringLayout.NORTH, rebirt1, 6, SpringLayout.SOUTH, mpmaestro1);
		spring.putConstraint(SpringLayout.WEST, rebirt1, 0, SpringLayout.WEST, kardivs1);
		spring.putConstraint(SpringLayout.SOUTH, rebirt1, 64, SpringLayout.SOUTH, mpmaestro1);
		spring.putConstraint(SpringLayout.EAST, rebirt1, 61, SpringLayout.WEST, kardivs1);
		spring.putConstraint(SpringLayout.NORTH, mpmaestro1, 2, SpringLayout.SOUTH, hpmaestro1);
		spring.putConstraint(SpringLayout.WEST, mpmaestro1, 0, SpringLayout.WEST, kardivs1);
		spring.putConstraint(SpringLayout.NORTH, hpmaestro1, 2, SpringLayout.SOUTH, geniehamer1);
		spring.putConstraint(SpringLayout.WEST, hpmaestro1, 0, SpringLayout.WEST, kardivs1);
		spring.putConstraint(SpringLayout.NORTH, geniehamer1, 3, SpringLayout.SOUTH, buf15001);
		spring.putConstraint(SpringLayout.WEST, geniehamer1, 0, SpringLayout.WEST, kardivs1);
		spring.putConstraint(SpringLayout.SOUTH, geniehamer1, 66, SpringLayout.SOUTH, buf15001);
		spring.putConstraint(SpringLayout.EAST, geniehamer1, 61, SpringLayout.WEST, kardivs1);
		spring.putConstraint(SpringLayout.NORTH, buf15001, -75, SpringLayout.SOUTH, lblGoldPre);
		spring.putConstraint(SpringLayout.WEST, buf15001, 0, SpringLayout.WEST, kardivs1);
		spring.putConstraint(SpringLayout.SOUTH, buf15001, -12, SpringLayout.SOUTH, lblGoldPre);
		spring.putConstraint(SpringLayout.EAST, buf15001, 61, SpringLayout.WEST, kardivs1);
		spring.putConstraint(SpringLayout.WEST, buf2k1, 0, SpringLayout.WEST, kardivs1);
		spring.putConstraint(SpringLayout.EAST, buf2k1, 0, SpringLayout.EAST, kardivs1);
		spring.putConstraint(SpringLayout.NORTH, dex1, 6, SpringLayout.SOUTH, ac3001);
		spring.putConstraint(SpringLayout.WEST, dex1, 0, SpringLayout.WEST, kardivs1);
		spring.putConstraint(SpringLayout.SOUTH, dex1, -59, SpringLayout.SOUTH, gold11);
		spring.putConstraint(SpringLayout.EAST, dex1, 116, SpringLayout.EAST, lblPlatPrenp);
		spring.putConstraint(SpringLayout.NORTH, ac3001, 6, SpringLayout.SOUTH, ac3501);
		spring.putConstraint(SpringLayout.WEST, ac3001, 0, SpringLayout.WEST, kardivs1);
		spring.putConstraint(SpringLayout.SOUTH, ac3001, -28, SpringLayout.SOUTH, f);
		spring.putConstraint(SpringLayout.EAST, ac3001, 61, SpringLayout.WEST, kardivs1);
		spring.putConstraint(SpringLayout.NORTH, ac3501, 0, SpringLayout.NORTH, dcpre1);
		spring.putConstraint(SpringLayout.WEST, ac3501, 61, SpringLayout.EAST, lblExpPre);
		spring.putConstraint(SpringLayout.SOUTH, ac3501, 46, SpringLayout.NORTH, dcpre1);
		spring.putConstraint(SpringLayout.EAST, ac3501, 122, SpringLayout.EAST, lblExpPre);
		spring.putConstraint(SpringLayout.NORTH, kardivs1, 16, SpringLayout.NORTH, this);
		spring.putConstraint(SpringLayout.WEST, kardivs1, 25, SpringLayout.EAST, lblSwtchPre);
		spring.putConstraint(SpringLayout.SOUTH, kardivs1, 0, SpringLayout.SOUTH, swicpre1);
		spring.putConstraint(SpringLayout.EAST, kardivs1, 323, SpringLayout.WEST, swicpre1);
		spring.putConstraint(SpringLayout.NORTH, otolot1, 1, SpringLayout.SOUTH, kanat1);
		spring.putConstraint(SpringLayout.SOUTH, otolot1, 64, SpringLayout.SOUTH, kanat1);
		spring.putConstraint(SpringLayout.NORTH, kanat1, 1, SpringLayout.SOUTH, pazar1);
		spring.putConstraint(SpringLayout.SOUTH, kanat1, 64, SpringLayout.SOUTH, pazar1);
		spring.putConstraint(SpringLayout.NORTH, pazar1, 0, SpringLayout.NORTH, klanname1);
		spring.putConstraint(SpringLayout.SOUTH, pazar1, 52, SpringLayout.NORTH, klanname1);
		spring.putConstraint(SpringLayout.NORTH, mtrina1, 0, SpringLayout.NORTH, platpre1);
		spring.putConstraint(SpringLayout.SOUTH, mtrina1, 52, SpringLayout.NORTH, platpre1);
		spring.putConstraint(SpringLayout.NORTH, lblBronzPre, 0, SpringLayout.NORTH, platpre1);
		spring.putConstraint(SpringLayout.NORTH, lblGoldPre, 0, SpringLayout.NORTH, bronz1);
		spring.putConstraint(SpringLayout.WEST, lblGoldPre, 6, SpringLayout.EAST, bronz1);
		spring.putConstraint(SpringLayout.NORTH, lblPlatPrenp, 0, SpringLayout.NORTH, gold11);
		spring.putConstraint(SpringLayout.EAST, lblPlatPrenp, 0, SpringLayout.EAST, lblWarPre);
		spring.putConstraint(SpringLayout.WEST, lblWarPre, 6, SpringLayout.EAST, warpre1);
		spring.putConstraint(SpringLayout.SOUTH, lblWarPre, 0, SpringLayout.SOUTH, f);
		spring.putConstraint(SpringLayout.WEST, lblExpPre, 6, SpringLayout.EAST, exppre1);
		spring.putConstraint(SpringLayout.SOUTH, lblExpPre, 0, SpringLayout.SOUTH, m2);
		spring.putConstraint(SpringLayout.NORTH, lblDcPre, 0, SpringLayout.NORTH, dcpre1);
		spring.putConstraint(SpringLayout.WEST, lblDcPre, 6, SpringLayout.EAST, dcpre1);
		spring.putConstraint(SpringLayout.WEST, swi, 6, SpringLayout.EAST, swicpre1);
		spring.putConstraint(SpringLayout.SOUTH, swi, 0, SpringLayout.SOUTH, swicpre1);
		spring.putConstraint(SpringLayout.NORTH, lblSwtchPre, 0, SpringLayout.NORTH, swicpre1);
		spring.putConstraint(SpringLayout.WEST, lblSwtchPre, 6, SpringLayout.EAST, swicpre1);
		spring.putConstraint(SpringLayout.NORTH, pathos1, 1, SpringLayout.SOUTH, minerva1);
		spring.putConstraint(SpringLayout.WEST, pathos1, 0, SpringLayout.WEST, swicpre1);
		spring.putConstraint(SpringLayout.EAST, pathos1, 0, SpringLayout.EAST, swicpre1);
		spring.putConstraint(SpringLayout.NORTH, minerva1, 6, SpringLayout.SOUTH, klanname1);
		spring.putConstraint(SpringLayout.WEST, minerva1, -6, SpringLayout.WEST, swicpre1);
		spring.putConstraint(SpringLayout.SOUTH, minerva1, 58, SpringLayout.SOUTH, klanname1);
		spring.putConstraint(SpringLayout.EAST, minerva1, 0, SpringLayout.EAST, swicpre1);
		spring.putConstraint(SpringLayout.NORTH, klanname1, 6, SpringLayout.SOUTH, platpre1);
		spring.putConstraint(SpringLayout.WEST, klanname1, 0, SpringLayout.WEST, swicpre1);
		spring.putConstraint(SpringLayout.SOUTH, klanname1, 58, SpringLayout.SOUTH, platpre1);
		spring.putConstraint(SpringLayout.EAST, klanname1, 61, SpringLayout.WEST, swicpre1);
		spring.putConstraint(SpringLayout.NORTH, platpre1, 2, SpringLayout.SOUTH, bronz1);
		spring.putConstraint(SpringLayout.WEST, platpre1, 0, SpringLayout.WEST, swicpre1);
		spring.putConstraint(SpringLayout.SOUTH, platpre1, 54, SpringLayout.SOUTH, bronz1);
		spring.putConstraint(SpringLayout.EAST, platpre1, 61, SpringLayout.WEST, swicpre1);
		spring.putConstraint(SpringLayout.NORTH, bronz1, 6, SpringLayout.SOUTH, ncs1);
		spring.putConstraint(SpringLayout.WEST, bronz1, 0, SpringLayout.WEST, swicpre1);
		spring.putConstraint(SpringLayout.SOUTH, bronz1, 58, SpringLayout.SOUTH, ncs1);
		spring.putConstraint(SpringLayout.EAST, bronz1, 0, SpringLayout.EAST, swicpre1);
		spring.putConstraint(SpringLayout.NORTH, ncs1, 6, SpringLayout.SOUTH, gold11);
		spring.putConstraint(SpringLayout.WEST, ncs1, 0, SpringLayout.WEST, swicpre1);
		spring.putConstraint(SpringLayout.SOUTH, ncs1, 52, SpringLayout.SOUTH, gold11);
		spring.putConstraint(SpringLayout.EAST, ncs1, 61, SpringLayout.WEST, swicpre1);
		spring.putConstraint(SpringLayout.NORTH, gold11, 4, SpringLayout.SOUTH, warpre1);
		spring.putConstraint(SpringLayout.WEST, gold11, 0, SpringLayout.WEST, swicpre1);
		spring.putConstraint(SpringLayout.SOUTH, gold11, 56, SpringLayout.SOUTH, warpre1);
		spring.putConstraint(SpringLayout.EAST, gold11, 61, SpringLayout.WEST, swicpre1);
		spring.putConstraint(SpringLayout.NORTH, warpre1, 6, SpringLayout.SOUTH, exppre1);
		spring.putConstraint(SpringLayout.WEST, warpre1, -61, SpringLayout.EAST, exppre1);
		spring.putConstraint(SpringLayout.SOUTH, warpre1, 49, SpringLayout.NORTH, f);
		spring.putConstraint(SpringLayout.EAST, warpre1, 0, SpringLayout.EAST, swicpre1);
		spring.putConstraint(SpringLayout.NORTH, exppre1, 0, SpringLayout.NORTH, m2);
		spring.putConstraint(SpringLayout.WEST, exppre1, 0, SpringLayout.WEST, swicpre1);
		spring.putConstraint(SpringLayout.SOUTH, exppre1, 52, SpringLayout.NORTH, m2);
		spring.putConstraint(SpringLayout.EAST, exppre1, 61, SpringLayout.WEST, swicpre1);
		spring.putConstraint(SpringLayout.NORTH, dcpre1, 6, SpringLayout.SOUTH, swicpre1);
		spring.putConstraint(SpringLayout.WEST, dcpre1, 0, SpringLayout.WEST, swicpre1);
		spring.putConstraint(SpringLayout.SOUTH, dcpre1, 58, SpringLayout.SOUTH, swicpre1);
		spring.putConstraint(SpringLayout.EAST, dcpre1, 77, SpringLayout.EAST, c2);
		spring.putConstraint(SpringLayout.WEST, swicpre1, 16, SpringLayout.EAST, a2);
		spring.putConstraint(SpringLayout.NORTH, swicpre1, -1, SpringLayout.NORTH, metingb);
		spring.putConstraint(SpringLayout.SOUTH, swicpre1, -9, SpringLayout.SOUTH, metinca);
		spring.putConstraint(SpringLayout.EAST, swicpre1, 77, SpringLayout.EAST, a2);
		spring.putConstraint(SpringLayout.NORTH, m2, -3, SpringLayout.NORTH, d1);
		spring.putConstraint(SpringLayout.WEST, m2, 0, SpringLayout.WEST, m1);
		spring.putConstraint(SpringLayout.NORTH, m1, -3, SpringLayout.NORTH, c1);
		spring.putConstraint(SpringLayout.EAST, m1, 0, SpringLayout.EAST, f1);
		spring.putConstraint(SpringLayout.NORTH, d2, 130, SpringLayout.NORTH, this);
		spring.putConstraint(SpringLayout.NORTH, buton, 7, SpringLayout.SOUTH, d1);
		spring.putConstraint(SpringLayout.SOUTH, c2, -4, SpringLayout.NORTH, d2);
		spring.putConstraint(SpringLayout.NORTH, tutarm, -2, SpringLayout.NORTH, f2);
		spring.putConstraint(SpringLayout.WEST, tutarm, 0, SpringLayout.WEST, tutartl);
		spring.putConstraint(SpringLayout.NORTH, tutartl, -3, SpringLayout.NORTH, f);
		spring.putConstraint(SpringLayout.WEST, tutartl, 23, SpringLayout.EAST, f);
		spring.putConstraint(SpringLayout.NORTH, f3, 0, SpringLayout.NORTH, f2);
		spring.putConstraint(SpringLayout.WEST, f3, 0, SpringLayout.WEST, f);
		spring.putConstraint(SpringLayout.NORTH, f2, 8, SpringLayout.SOUTH, f1);
		spring.putConstraint(SpringLayout.EAST, f2, 0, SpringLayout.EAST, f1);
		spring.putConstraint(SpringLayout.NORTH, f1, -1, SpringLayout.NORTH, f);
		spring.putConstraint(SpringLayout.WEST, f1, 81, SpringLayout.EAST, f);
		spring.putConstraint(SpringLayout.NORTH, f, 13, SpringLayout.SOUTH, buton);
		spring.putConstraint(SpringLayout.WEST, f, 0, SpringLayout.WEST, dx);
		spring.putConstraint(SpringLayout.WEST, buton, 0, SpringLayout.WEST, dx);
		spring.putConstraint(SpringLayout.EAST, buton, 0, SpringLayout.EAST, d2);
		spring.putConstraint(SpringLayout.NORTH, d1, 132, SpringLayout.NORTH, this);
		spring.putConstraint(SpringLayout.NORTH, dx, 1, SpringLayout.NORTH, hesap);
		spring.putConstraint(SpringLayout.WEST, dx, 0, SpringLayout.WEST, a1);
		spring.putConstraint(SpringLayout.NORTH, hesap, 6, SpringLayout.SOUTH, metinca);
		spring.putConstraint(SpringLayout.WEST, hesap, 0, SpringLayout.WEST, metingb);
		spring.putConstraint(SpringLayout.EAST, hesap, 0, SpringLayout.EAST, metingb);
		spring.putConstraint(SpringLayout.WEST, c2, 0, SpringLayout.WEST, a2);
		spring.putConstraint(SpringLayout.WEST, d2, 0, SpringLayout.WEST, a2);
		spring.putConstraint(SpringLayout.WEST, c1, 0, SpringLayout.WEST, a1);
		spring.putConstraint(SpringLayout.SOUTH, c1, -6, SpringLayout.NORTH, d1);
		spring.putConstraint(SpringLayout.EAST, c1, 0, SpringLayout.EAST, a1);
		spring.putConstraint(SpringLayout.WEST, d1, 0, SpringLayout.WEST, a1);
		spring.putConstraint(SpringLayout.EAST, d1, 78, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, metinca, -5, SpringLayout.NORTH, b1);
		spring.putConstraint(SpringLayout.WEST, metinca, 0, SpringLayout.WEST, metingb);
		spring.putConstraint(SpringLayout.NORTH, metingb, -1, SpringLayout.NORTH, a1);
		spring.putConstraint(SpringLayout.WEST, metingb, 6, SpringLayout.EAST, a1);
		spring.putConstraint(SpringLayout.NORTH, b1, 17, SpringLayout.SOUTH, a1);
		spring.putConstraint(SpringLayout.EAST, a1, 0, SpringLayout.EAST, b1);
		spring.putConstraint(SpringLayout.NORTH, b2, 17, SpringLayout.SOUTH, a2);
		spring.putConstraint(SpringLayout.WEST, b2, 103, SpringLayout.EAST, b1);
		spring.putConstraint(SpringLayout.WEST, a2, 187, SpringLayout.WEST, this);
	
		spring.putConstraint(SpringLayout.NORTH, a2, 25, SpringLayout.NORTH, this);
		spring.putConstraint(SpringLayout.NORTH, a1, 24, SpringLayout.NORTH, this);
		spring.putConstraint(SpringLayout.WEST, a1, 11, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.EAST, b1, 84, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.WEST, b1, 11, SpringLayout.WEST, this);
		setLayout(spring);
		f.setForeground(new Color(128, 128, 255));
		f.setFont(new Font("Times New Roman", Font.BOLD, 13));
		m1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		s1.setForeground(new Color(128, 128, 128));
												add(swicpre1);
												add(dcpre1);
												add(exppre1);
												add(warpre1);
												add(gold11);
												add(ncs1);
												add(bronz1);
												add(platpre1);
												add(klanname1);
												add(minerva1);
												add(pathos1);
												add(kardivs1);
												add(genie1);
												add(trina1);
												add(mtrina1);
												add(pazar1);
												add(kanat1);
												add(otolot1);
												add(ac3501);
												add(ac3001);
												add(dex1);
												add(buf2k1);
												add(buf15001);
												add(geniehamer1);
												add(hpmaestro1);
												add(mpmaestro1);
												add(rebirt1);
												add(sw1);
												add(seal1);
												add(mercent1);
												add(durat1);
												add(vip1);
												add(atak1);
												add(noah1);
												add(np1);
												add(walkar1);
												add(walkhel1);
												add(gryptonar1);
												add(gryptonhel1);
												add(bahar1);
												add(bahhel1);
												add(yar1);
												add(yahel1);
												
												
												
												
												
												
												
												
												
												
												
												
												
												
		add(m1);
		m2.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(m2);
		
		
		add(f);
		f1.setFont(new Font("Tahoma", Font.BOLD, 13));
		add(f1);
		f2.setFont(new Font("Tahoma", Font.BOLD, 13));
		add(f2);
		f3.setForeground(new Color(128, 128, 255));
		f3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		add(f3);
		tutartl.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(tutartl);
		tutarm.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(tutarm);
		
		metingb.setFont(new Font("Tahoma", Font.BOLD, 15));
		metingb.setColumns(6);
		add(hesap);
		hesap.setColumns(10);
		hesap.setBackground(Color.green);
		add(metingb);
		metingb.setBackground(Color.yellow);
		metinca.setFont(new Font("Tahoma", Font.BOLD, 15));
		metinca.setColumns(6);
		dx.setForeground(new Color(128, 128, 255));
		dx.setFont(new Font("Tahoma", Font.BOLD, 13));
		add(dx);
		add(metinca);
		metinca.setBackground(Color.yellow);
		a1.setForeground(new Color(128, 128, 255));
		
		a1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		add(a1);
		a2.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(a2);
		b1.setForeground(new Color(128, 128, 255));
		b1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		add(b1);
		b2.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(b2);
		c1.setForeground(new Color(128, 128, 255));
		c1.setHorizontalAlignment(SwingConstants.LEFT);
		c1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		add(c1);
	
		c2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		add(c2);
		d1.setForeground(new Color(128, 128, 255));
		d1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		add(d1);  d2.setFont(new Font("Tahoma", Font.BOLD, 14));
  add(d2);
		

		
		add(buton);
		buton.addActionListener(this);
		s1.setVerticalAlignment(SwingConstants.BOTTOM);
		s1.setHorizontalAlignment(SwingConstants.LEFT);
		s1.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(s1);
		lblSwtchPre.setVerticalAlignment(SwingConstants.BOTTOM);
		lblSwtchPre.setHorizontalAlignment(SwingConstants.LEFT);
		lblSwtchPre.setForeground(new Color(128, 128, 128));
		lblSwtchPre.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblSwtchPre);
		swi.setVerticalAlignment(SwingConstants.BOTTOM);
		swi.setHorizontalAlignment(SwingConstants.LEFT);
		swi.setForeground(new Color(255, 128, 128));
		swi.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(swi);
		lblDcPre.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDcPre.setHorizontalAlignment(SwingConstants.LEFT);
		lblDcPre.setForeground(new Color(128, 128, 128));
		lblDcPre.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblDcPre);
		lblExpPre.setVerticalAlignment(SwingConstants.BOTTOM);
		lblExpPre.setHorizontalAlignment(SwingConstants.LEFT);
		lblExpPre.setForeground(new Color(128, 128, 128));
		lblExpPre.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblExpPre);
		lblWarPre.setVerticalAlignment(SwingConstants.BOTTOM);
		lblWarPre.setHorizontalAlignment(SwingConstants.LEFT);
		lblWarPre.setForeground(Color.GRAY);
		lblWarPre.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblWarPre);
		lblPlatPrenp.setVerticalAlignment(SwingConstants.BOTTOM);
		lblPlatPrenp.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatPrenp.setForeground(Color.GRAY);
		lblPlatPrenp.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblPlatPrenp);
		lblGoldPre.setVerticalAlignment(SwingConstants.BOTTOM);
		lblGoldPre.setHorizontalAlignment(SwingConstants.LEFT);
		lblGoldPre.setForeground(Color.GRAY);
		lblGoldPre.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblGoldPre);
		lblBronzPre.setVerticalAlignment(SwingConstants.BOTTOM);
		lblBronzPre.setHorizontalAlignment(SwingConstants.LEFT);
		lblBronzPre.setForeground(Color.GRAY);
		lblBronzPre.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblBronzPre);
		lblClanName.setVerticalAlignment(SwingConstants.BOTTOM);
		lblClanName.setHorizontalAlignment(SwingConstants.LEFT);
		lblClanName.setForeground(Color.GRAY);
		lblClanName.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblClanName);
		lblBronzPre_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblBronzPre_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblBronzPre_2.setForeground(Color.GRAY);
		lblBronzPre_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblBronzPre_2);
		lblPathosNp.setVerticalAlignment(SwingConstants.BOTTOM);
		lblPathosNp.setHorizontalAlignment(SwingConstants.LEFT);
		lblPathosNp.setForeground(Color.GRAY);
		lblPathosNp.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblPathosNp);
		lblTrnaNp.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTrnaNp.setHorizontalAlignment(SwingConstants.LEFT);
		lblTrnaNp.setForeground(Color.GRAY);
		lblTrnaNp.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(lblTrnaNp);
		lblMtrnaNp.setVerticalAlignment(SwingConstants.BOTTOM);
		lblMtrnaNp.setHorizontalAlignment(SwingConstants.LEFT);
		lblMtrnaNp.setForeground(Color.GRAY);
		lblMtrnaNp.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(lblMtrnaNp);
		lblPazarSc.setVerticalAlignment(SwingConstants.BOTTOM);
		lblPazarSc.setHorizontalAlignment(SwingConstants.LEFT);
		lblPazarSc.setForeground(Color.GRAY);
		lblPazarSc.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(lblPazarSc);
		lblKanatNp.setVerticalAlignment(SwingConstants.BOTTOM);
		lblKanatNp.setHorizontalAlignment(SwingConstants.LEFT);
		lblKanatNp.setForeground(Color.GRAY);
		lblKanatNp.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblKanatNp);
		lblOtolotNp.setVerticalAlignment(SwingConstants.BOTTOM);
		lblOtolotNp.setHorizontalAlignment(SwingConstants.LEFT);
		lblOtolotNp.setForeground(Color.GRAY);
		lblOtolotNp.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblOtolotNp);
		lblNcsNp.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNcsNp.setHorizontalAlignment(SwingConstants.LEFT);
		lblNcsNp.setForeground(Color.GRAY);
		lblNcsNp.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblNcsNp);
		lblKrdvsNp.setVerticalAlignment(SwingConstants.BOTTOM);
		lblKrdvsNp.setHorizontalAlignment(SwingConstants.LEFT);
		lblKrdvsNp.setForeground(Color.GRAY);
		lblKrdvsNp.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblKrdvsNp);
		lblAc.setVerticalAlignment(SwingConstants.BOTTOM);
		lblAc.setHorizontalAlignment(SwingConstants.LEFT);
		lblAc.setForeground(Color.GRAY);
		lblAc.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblAc);
		lblAc_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblAc_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblAc_1.setForeground(Color.GRAY);
		lblAc_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblAc_1);
		lblDexSc.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDexSc.setHorizontalAlignment(SwingConstants.LEFT);
		lblDexSc.setForeground(Color.GRAY);
		lblDexSc.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblDexSc);
		lblkHp.setVerticalAlignment(SwingConstants.BOTTOM);
		lblkHp.setHorizontalAlignment(SwingConstants.LEFT);
		lblkHp.setForeground(Color.GRAY);
		lblkHp.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblkHp);
		lblHp.setVerticalAlignment(SwingConstants.BOTTOM);
		lblHp.setHorizontalAlignment(SwingConstants.LEFT);
		lblHp.setForeground(Color.GRAY);
		lblHp.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblHp);
		lblGhammerNp.setVerticalAlignment(SwingConstants.BOTTOM);
		lblGhammerNp.setHorizontalAlignment(SwingConstants.LEFT);
		lblGhammerNp.setForeground(Color.GRAY);
		lblGhammerNp.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblGhammerNp);
		lblHpMaest.setVerticalAlignment(SwingConstants.BOTTOM);
		lblHpMaest.setHorizontalAlignment(SwingConstants.LEFT);
		lblHpMaest.setForeground(Color.GRAY);
		lblHpMaest.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblHpMaest);
		lblMpMaest.setVerticalAlignment(SwingConstants.BOTTOM);
		lblMpMaest.setHorizontalAlignment(SwingConstants.LEFT);
		lblMpMaest.setForeground(Color.GRAY);
		lblMpMaest.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblMpMaest);
		lblRebrthSc.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRebrthSc.setHorizontalAlignment(SwingConstants.LEFT);
		lblRebrthSc.setForeground(Color.GRAY);
		lblRebrthSc.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblRebrthSc);
		s1_17.setVerticalAlignment(SwingConstants.BOTTOM);
		s1_17.setHorizontalAlignment(SwingConstants.LEFT);
		s1_17.setForeground(Color.GRAY);
		s1_17.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(s1_17);
		lblNpSc.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNpSc.setHorizontalAlignment(SwingConstants.LEFT);
		lblNpSc.setForeground(Color.GRAY);
		lblNpSc.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblNpSc);
		lblNoahSc.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNoahSc.setHorizontalAlignment(SwingConstants.LEFT);
		lblNoahSc.setForeground(Color.GRAY);
		lblNoahSc.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblNoahSc);
		lblAtakSc.setVerticalAlignment(SwingConstants.BOTTOM);
		lblAtakSc.setHorizontalAlignment(SwingConstants.LEFT);
		lblAtakSc.setForeground(Color.GRAY);
		lblAtakSc.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblAtakSc);
		s1_21.setVerticalAlignment(SwingConstants.BOTTOM);
		s1_21.setHorizontalAlignment(SwingConstants.LEFT);
		s1_21.setForeground(Color.GRAY);
		s1_21.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		add(s1_21);
		lblDuratNp.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDuratNp.setHorizontalAlignment(SwingConstants.LEFT);
		lblDuratNp.setForeground(Color.GRAY);
		lblDuratNp.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblDuratNp);
		lblMercentNp.setVerticalAlignment(SwingConstants.BOTTOM);
		lblMercentNp.setHorizontalAlignment(SwingConstants.LEFT);
		lblMercentNp.setForeground(Color.GRAY);
		lblMercentNp.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblMercentNp);
		lblSealNp.setVerticalAlignment(SwingConstants.BOTTOM);
		lblSealNp.setHorizontalAlignment(SwingConstants.LEFT);
		lblSealNp.setForeground(Color.GRAY);
		lblSealNp.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblSealNp);
		lblSwSc.setVerticalAlignment(SwingConstants.BOTTOM);
		lblSwSc.setHorizontalAlignment(SwingConstants.LEFT);
		lblSwSc.setForeground(Color.GRAY);
		lblSwSc.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblSwSc);
		s1_26.setVerticalAlignment(SwingConstants.BOTTOM);
		s1_26.setHorizontalAlignment(SwingConstants.LEFT);
		s1_26.setForeground(Color.GRAY);
		s1_26.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(s1_26);
		s1_27.setVerticalAlignment(SwingConstants.BOTTOM);
		s1_27.setHorizontalAlignment(SwingConstants.LEFT);
		s1_27.setForeground(Color.GRAY);
		s1_27.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(s1_27);
		s1_28.setVerticalAlignment(SwingConstants.BOTTOM);
		s1_28.setHorizontalAlignment(SwingConstants.LEFT);
		s1_28.setForeground(Color.GRAY);
		s1_28.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(s1_28);
		s1_29.setVerticalAlignment(SwingConstants.BOTTOM);
		s1_29.setHorizontalAlignment(SwingConstants.LEFT);
		s1_29.setForeground(Color.GRAY);
		s1_29.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(s1_29);
		s1_30.setVerticalAlignment(SwingConstants.BOTTOM);
		s1_30.setHorizontalAlignment(SwingConstants.LEFT);
		s1_30.setForeground(Color.GRAY);
		s1_30.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(s1_30);
		lblYeneriArmor.setVerticalAlignment(SwingConstants.BOTTOM);
		lblYeneriArmor.setHorizontalAlignment(SwingConstants.LEFT);
		lblYeneriArmor.setForeground(Color.GRAY);
		lblYeneriArmor.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblYeneriArmor);
		lblYeniceriArmor.setVerticalAlignment(SwingConstants.BOTTOM);
		lblYeniceriArmor.setHorizontalAlignment(SwingConstants.LEFT);
		lblYeniceriArmor.setForeground(Color.GRAY);
		lblYeniceriArmor.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		add(lblYeniceriArmor);
		gen.setVerticalAlignment(SwingConstants.BOTTOM);
		gen.setHorizontalAlignment(SwingConstants.LEFT);
		gen.setForeground(new Color(255, 128, 128));
		gen.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(gen);
		tri.setVerticalAlignment(SwingConstants.BOTTOM);
		tri.setHorizontalAlignment(SwingConstants.LEFT);
		tri.setForeground(new Color(255, 128, 128));
		tri.setFont(new Font("Sitka Small", Font.BOLD, 14));
		
		add(tri);
		mtri.setVerticalAlignment(SwingConstants.BOTTOM);
		mtri.setHorizontalAlignment(SwingConstants.LEFT);
		mtri.setForeground(new Color(255, 128, 128));
		mtri.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(mtri);
		paz.setVerticalAlignment(SwingConstants.BOTTOM);
		paz.setHorizontalAlignment(SwingConstants.LEFT);
		paz.setForeground(new Color(255, 128, 128));
		paz.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(paz);
		kan.setVerticalAlignment(SwingConstants.BOTTOM);
		kan.setHorizontalAlignment(SwingConstants.LEFT);
		kan.setForeground(new Color(255, 128, 128));
		kan.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(kan);
		oto.setVerticalAlignment(SwingConstants.BOTTOM);
		oto.setHorizontalAlignment(SwingConstants.LEFT);
		oto.setForeground(new Color(255, 128, 128));
		oto.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(oto);
		dc.setVerticalAlignment(SwingConstants.BOTTOM);
		dc.setHorizontalAlignment(SwingConstants.LEFT);
		dc.setForeground(new Color(255, 128, 128));
		dc.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(dc);
		exp.setVerticalAlignment(SwingConstants.BOTTOM);
		exp.setHorizontalAlignment(SwingConstants.LEFT);
		exp.setForeground(new Color(255, 128, 128));
		exp.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(exp);
		wa.setVerticalAlignment(SwingConstants.BOTTOM);
		wa.setHorizontalAlignment(SwingConstants.LEFT);
		wa.setForeground(new Color(255, 128, 128));
		wa.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(wa);
		pla.setVerticalAlignment(SwingConstants.BOTTOM);
		pla.setHorizontalAlignment(SwingConstants.LEFT);
		pla.setForeground(new Color(255, 128, 128));
		pla.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(pla);
		nc.setVerticalAlignment(SwingConstants.BOTTOM);
		nc.setHorizontalAlignment(SwingConstants.LEFT);
		nc.setForeground(new Color(255, 128, 128));
		nc.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(nc);
		gol.setVerticalAlignment(SwingConstants.BOTTOM);
		gol.setHorizontalAlignment(SwingConstants.LEFT);
		gol.setForeground(new Color(255, 128, 128));
		gol.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(gol);
		bro.setVerticalAlignment(SwingConstants.BOTTOM);
		bro.setHorizontalAlignment(SwingConstants.LEFT);
		bro.setForeground(new Color(255, 128, 128));
		bro.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(bro);
		cla.setVerticalAlignment(SwingConstants.BOTTOM);
		cla.setHorizontalAlignment(SwingConstants.LEFT);
		cla.setForeground(new Color(255, 128, 128));
		cla.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(cla);
		min.setVerticalAlignment(SwingConstants.BOTTOM);
		min.setHorizontalAlignment(SwingConstants.LEFT);
		min.setForeground(new Color(255, 128, 128));
		min.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(min);
		pat.setVerticalAlignment(SwingConstants.BOTTOM);
		pat.setHorizontalAlignment(SwingConstants.LEFT);
		pat.setForeground(new Color(255, 128, 128));
		pat.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(pat);
		kar.setVerticalAlignment(SwingConstants.BOTTOM);
		kar.setHorizontalAlignment(SwingConstants.LEFT);
		kar.setForeground(new Color(255, 128, 128));
		kar.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(kar);
		ac35.setVerticalAlignment(SwingConstants.BOTTOM);
		ac35.setHorizontalAlignment(SwingConstants.LEFT);
		ac35.setForeground(new Color(255, 128, 128));
		ac35.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(ac35);
		ac30.setVerticalAlignment(SwingConstants.BOTTOM);
		ac30.setHorizontalAlignment(SwingConstants.LEFT);
		ac30.setForeground(new Color(255, 128, 128));
		ac30.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(ac30);
		de.setVerticalAlignment(SwingConstants.BOTTOM);
		de.setHorizontalAlignment(SwingConstants.LEFT);
		de.setForeground(new Color(255, 128, 128));
		de.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(de);
		k2.setVerticalAlignment(SwingConstants.BOTTOM);
		k2.setHorizontalAlignment(SwingConstants.LEFT);
		k2.setForeground(new Color(255, 128, 128));
		k2.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(k2);
		k15.setVerticalAlignment(SwingConstants.BOTTOM);
		k15.setHorizontalAlignment(SwingConstants.LEFT);
		k15.setForeground(new Color(255, 128, 128));
		k15.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(k15);
		gha.setVerticalAlignment(SwingConstants.BOTTOM);
		gha.setHorizontalAlignment(SwingConstants.LEFT);
		gha.setForeground(new Color(255, 128, 128));
		gha.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(gha);
		hpm.setVerticalAlignment(SwingConstants.BOTTOM);
		hpm.setHorizontalAlignment(SwingConstants.LEFT);
		hpm.setForeground(new Color(255, 128, 128));
		hpm.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(hpm);
		mpm.setVerticalAlignment(SwingConstants.BOTTOM);
		mpm.setHorizontalAlignment(SwingConstants.LEFT);
		mpm.setForeground(new Color(255, 128, 128));
		mpm.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(mpm);
		reb.setVerticalAlignment(SwingConstants.BOTTOM);
		reb.setHorizontalAlignment(SwingConstants.LEFT);
		reb.setForeground(new Color(255, 128, 128));
		reb.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(reb);
		swscc.setVerticalAlignment(SwingConstants.BOTTOM);
		swscc.setHorizontalAlignment(SwingConstants.LEFT);
		swscc.setForeground(new Color(255, 128, 128));
		swscc.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(swscc);
		sea.setVerticalAlignment(SwingConstants.BOTTOM);
		sea.setHorizontalAlignment(SwingConstants.LEFT);
		sea.setForeground(new Color(255, 128, 128));
		sea.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(sea);
		mer.setVerticalAlignment(SwingConstants.BOTTOM);
		mer.setHorizontalAlignment(SwingConstants.LEFT);
		mer.setForeground(new Color(255, 128, 128));
		mer.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(mer);
		dur.setVerticalAlignment(SwingConstants.BOTTOM);
		dur.setHorizontalAlignment(SwingConstants.LEFT);
		dur.setForeground(new Color(255, 128, 128));
		dur.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(dur);
		vi.setVerticalAlignment(SwingConstants.BOTTOM);
		vi.setHorizontalAlignment(SwingConstants.LEFT);
		vi.setForeground(new Color(255, 128, 128));
		vi.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(vi);
		at.setVerticalAlignment(SwingConstants.BOTTOM);
		at.setHorizontalAlignment(SwingConstants.LEFT);
		at.setForeground(new Color(255, 128, 128));
		at.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(at);
		noa.setVerticalAlignment(SwingConstants.BOTTOM);
		noa.setHorizontalAlignment(SwingConstants.LEFT);
		noa.setForeground(new Color(255, 128, 128));
		noa.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(noa);
		npsc.setVerticalAlignment(SwingConstants.BOTTOM);
		npsc.setHorizontalAlignment(SwingConstants.LEFT);
		npsc.setForeground(new Color(255, 128, 128));
		npsc.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(npsc);
		ww1.setVerticalAlignment(SwingConstants.BOTTOM);
		ww1.setHorizontalAlignment(SwingConstants.LEFT);
		ww1.setForeground(new Color(255, 128, 128));
		ww1.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(ww1);
		yy2.setVerticalAlignment(SwingConstants.BOTTOM);
		yy2.setHorizontalAlignment(SwingConstants.LEFT);
		yy2.setForeground(new Color(255, 128, 128));
		yy2.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(yy2);
		yy1.setVerticalAlignment(SwingConstants.BOTTOM);
		yy1.setHorizontalAlignment(SwingConstants.LEFT);
		yy1.setForeground(new Color(255, 128, 128));
		yy1.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(yy1);
		bb2.setVerticalAlignment(SwingConstants.BOTTOM);
		bb2.setHorizontalAlignment(SwingConstants.LEFT);
		bb2.setForeground(new Color(255, 128, 128));
		bb2.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(bb2);
		bb1.setVerticalAlignment(SwingConstants.BOTTOM);
		bb1.setHorizontalAlignment(SwingConstants.LEFT);
		bb1.setForeground(new Color(255, 128, 128));
		bb1.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(bb1);
		gg1.setVerticalAlignment(SwingConstants.BOTTOM);
		gg1.setHorizontalAlignment(SwingConstants.LEFT);
		gg1.setForeground(new Color(255, 128, 128));
		gg1.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(gg1);
		gg2.setVerticalAlignment(SwingConstants.BOTTOM);
		gg2.setHorizontalAlignment(SwingConstants.LEFT);
		gg2.setForeground(new Color(255, 128, 128));
		gg2.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(gg2);
		ww2.setVerticalAlignment(SwingConstants.BOTTOM);
		ww2.setHorizontalAlignment(SwingConstants.LEFT);
		ww2.setForeground(new Color(255, 128, 128));
		ww2.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		add(ww2);
		
		
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		// TODO Auto-generated method stub
		double a=Double.parseDouble(metingb.getText());
		double b=Double.parseDouble(metinca.getText());
		double x=Double.parseDouble(hesap.getText());
		
		DecimalFormat formatter = new DecimalFormat("##.##");
		DecimalFormat formatter1 = new DecimalFormat("##.##");
		
		double r,d,v,v1;
		r=b/400;  //1cash
		d=r*100/a; // 1cash  m cýnsýnden
		
		v=r*x;  
		v1=x*d;
												double gen1,tri1,mtri1,paz1,kan1,oto1,swi1,dc1,wa1,pla1,nc1,gol1,bro1,cla1,min1,exp1;
												double pat1,kar1,ac351,ac301,de1,k21,k151,gha1,hpm1,mpm1,reb1,swscc1,sea1,mer1,vi1;
												double at1,noa1,npsc1,ww11,ww22,gg11,gg22,bb11,bb22,yy11,yy22,dur1;
												
												double gen1x,tri1x,mtri1x,paz1x,kan1x,oto1x,swi1x,dc1x,wa1x,pla1x,nc1x,gol1x,bro1x,cla1x,min1x;
												double pat1x,kar1x,ac351x,ac301x,de1x,k21x,k151x,gha1x,hpm1x,mpm1x,reb1x,swscc1x,sea1x,mer1x,vi1x;
												double exp1x,at1x,expx,noa1x,npsc1x,ww11x,ww22x,gg11x,gg22x,bb11x,bb22x,yy11x,yy22x,dur1x;
												
												
												
												
												
												exp1=r*2796; gen1=r*149;  tri1=r*800; mtri1=r*959; paz1=r*360;  kan1=r*899; oto1=r*248;
												swi1=r*3596;  dc1=r*2159; wa1=r*2599;  pla1=r*2796; nc1=r*1599; gol1=r*1996; bro1=r*716; cla1=r*399; min1=r*729;
												pat1=r*479; kar1=r*400; ac351=r*249; ac301=r*149; de1=r*169; k21=r*249; k151=r*149; gha1=r*99;  hpm1=r*200; mpm1=r*200; reb1=r*249;
												swscc1=r*79;   sea1=r*2800;  mer1=r*159; vi1=r*349; at1=r*159; noa1=r*149; npsc1=r*799; 
												ww11=r*429;  ww22=r*349; gg11=r*429; gg22=r*349; bb11=r*429; bb22=r*349; yy11=r*429; yy22=r*349; dur1=r*59;
												
												
												
												exp1x=d*2796; gen1x=d*149;  tri1x=d*800; mtri1x=d*959; paz1x=d*360;  kan1x=d*899; oto1x=d*248;
												swi1x=d*3596;  dc1x=d*2159; wa1x=d*2599;  pla1x=d*2796; nc1x=d*1599; gol1x=d*1996; bro1x=d*716; cla1x=d*399; min1x=d*729;
												pat1x=d*479; kar1x=d*400; ac351x=d*249; ac301x=d*149; de1x=d*169; k21x=d*249; k151x=d*149; gha1x=d*99;  hpm1x=d*200; mpm1x=d*200; reb1x=d*249;
												swscc1x=d*79;   sea1x=d*2800;  mer1x=d*159; vi1x=d*349; at1x=d*159; noa1x=d*149; npsc1x=d*799; 
												ww11x=d*429;  ww22x=d*349; gg11x=d*429; gg22x=d*349; bb11x=d*429; bb22x=d*349; yy11x=d*429; yy22x=d*349; dur1x=d*59;
												
				
												
												
												
												m1.setForeground(Color.red);
												m2.setForeground(Color.green);
												
												tutartl.setForeground(Color.red);
												tutarm.setForeground(Color.green);
												
		if(e.getSource().equals(buton)) {
			System.out.println("butona basýldý");
			m1.setText(String.valueOf(formatter.format(r)));
			m2.setText(String.valueOf(formatter.format(d)));
			tutartl.setText(String.valueOf(formatter.format(v)));
			tutarm.setText(String.valueOf(formatter.format(v1)));
			
			
			
					tutartl.setForeground(Color.red);
					tutarm.setForeground(Color.green);
			
		    exp.setText(String.valueOf(formatter1.format(exp1)+"TL / "+formatter1.format(exp1x)+" M"));
			gen.setText(String.valueOf(formatter1.format(gen1)+"TL / "+formatter1.format(gen1x)+" M"));
			vi.setText(String.valueOf(formatter1.format(vi1)+"TL / "+formatter1.format(vi1x)+" M"));
			tri.setText(String.valueOf(formatter1.format(tri1)+"TL / "+formatter1.format(tri1x)+" M"));
			mtri.setText(String.valueOf(formatter1.format(mtri1)+"TL / "+formatter1.format(mtri1x)+" M"));
			paz.setText(String.valueOf(formatter1.format(paz1)+"TL / "+formatter1.format(paz1x)+" M"));
			kan.setText(String.valueOf(formatter1.format(kan1)+"TL / "+formatter1.format(kan1x)+" M"));
			oto.setText(String.valueOf(formatter1.format(oto1)+"TL / "+formatter1.format(oto1x)+" M"));
			swi.setText(String.valueOf(formatter1.format(swi1)+"TL / "+formatter1.format(swi1x)+" M"));
			dc.setText(String.valueOf(formatter1.format(dc1)+"TL / "+formatter1.format(dc1x)+" M"));
			wa.setText(String.valueOf(formatter1.format(wa1)+"TL / "+formatter1.format(wa1x)+" M"));
			pla.setText(String.valueOf(formatter1.format(pla1)+"TL / "+formatter1.format(pla1x)+" M"));
			nc.setText(String.valueOf(formatter1.format(nc1)+"TL / "+formatter1.format(nc1x)+" M"));
			gol.setText(String.valueOf(formatter1.format(gol1)+"TL / "+formatter1.format(gol1x)+" M"));
			bro.setText(String.valueOf(formatter1.format(bro1)+"TL / "+formatter1.format(bro1x)+" M"));
			cla.setText(String.valueOf(formatter1.format(cla1)+"TL / "+formatter1.format(cla1x)+" M"));
			min.setText(String.valueOf(formatter1.format(min1)+"TL / "+formatter1.format(min1x)+" M"));
			pat.setText(String.valueOf(formatter1.format(pat1)+"TL / "+formatter1.format(pat1x)+" M"));
			kar.setText(String.valueOf(formatter1.format(kar1)+"TL / "+formatter1.format(kar1x)+" M"));
			ac35.setText(String.valueOf(formatter1.format(ac351)+"TL / "+formatter1.format(ac351x)+" M"));
			ac30.setText(String.valueOf(formatter1.format(ac301)+"TL / "+formatter1.format(ac301x)+" M"));
			de.setText(String.valueOf(formatter1.format(de1)+"TL / "+formatter1.format(de1x)+" M"));
			k2.setText(String.valueOf(formatter1.format(k21)+"TL / "+formatter1.format(k21x)+" M"));
			k15.setText(String.valueOf(formatter1.format(k151)+"TL / "+formatter1.format(k151x)+" M"));
			gha.setText(String.valueOf(formatter1.format(gha1)+"TL / "+formatter1.format(gha1x)+" M"));
			hpm.setText(String.valueOf(formatter1.format(hpm1)+"TL / "+formatter1.format(hpm1x)+" M"));
			mpm.setText(String.valueOf(formatter1.format(mpm1)+"TL / "+formatter1.format(mpm1x)+" M"));
			reb.setText(String.valueOf(formatter1.format(reb1)+"TL / "+formatter1.format(reb1x)+" M"));
			swscc.setText(String.valueOf(formatter1.format(swscc1)+"TL / "+formatter1.format(swscc1x)+" M"));
			sea.setText(String.valueOf(formatter1.format(sea1)+"TL / "+formatter1.format(sea1x)+" M"));
			mer.setText(String.valueOf(formatter1.format(mer1)+"TL / "+formatter1.format(mer1x)+" M"));
			noa.setText(String.valueOf(formatter1.format(noa1)+"TL / "+formatter1.format(noa1x)+" M"));
			at.setText(String.valueOf(formatter1.format(at1)+"TL / "+formatter1.format(at1x)+" M"));
			npsc.setText(String.valueOf(formatter1.format(npsc1)+"TL / "+formatter1.format(npsc1x)+" M"));
			ww1.setText(String.valueOf(formatter1.format(ww11)+"TL / "+formatter1.format(ww11x)+" M"));
			ww2.setText(String.valueOf(formatter1.format(ww22)+"TL / "+formatter1.format(ww22x)+" M"));
			gg1.setText(String.valueOf(formatter1.format(gg11)+"TL / "+formatter1.format(gg11x)+" M"));
			gg2.setText(String.valueOf(formatter1.format(gg22)+"TL / "+formatter1.format(gg22x)+" M"));
			bb1.setText(String.valueOf(formatter1.format(bb11)+"TL / "+formatter1.format(bb11x)+" M"));
			bb2.setText(String.valueOf(formatter1.format(bb22)+"TL / "+formatter1.format(bb22x)+" M"));
			yy1.setText(String.valueOf(formatter1.format(yy11)+"TL / "+formatter1.format(yy11x)+" M"));
			yy2.setText(String.valueOf(formatter1.format(yy22)+"TL / "+formatter1.format(yy22x)+" M"));
			dur.setText(String.valueOf(formatter1.format(dur1)+"TL / "+formatter1.format(dur1x)+" M"));
			
							
		}
		repaint();
		 }
		
	
	
	
	
}
