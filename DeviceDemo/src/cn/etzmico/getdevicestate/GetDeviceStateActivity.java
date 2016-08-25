package cn.etzmico.getdevicestate;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.TextView;

public class GetDeviceStateActivity extends Activity {
	private TextView device_id_tv, device_software_version_tv, line1_number_tv,
			network_country_iso_tv, network_operator_tv,
			network_operator_name_tv, network_type_tv, phone_type_tv,
			sim_country_iso_tv, sim_operator_tv, sim_operator_name_tv,
			sim_serial_number_tv, sim_state_tv, subscriber_id_tv,
			voice_mail_number_tv;
	private String device_id, device_software_version, line1_number,
			network_country_iso, network_operator, network_operator_name,
			sim_country_iso, sim_operator, sim_operator_name,
			sim_serial_number, subscriber_id, voice_mail_number;
	private int network_type, phone_type, sim_state;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		device_id_tv 				= (TextView) findViewById(R.id.textView1); 
		device_software_version_tv 	= (TextView) findViewById(R.id.textView2); 
		line1_number_tv 			= (TextView) findViewById(R.id.textView3); //设备电话卡号码
		network_country_iso_tv 		= (TextView) findViewById(R.id.textView4); //
		network_operator_tv 		= (TextView) findViewById(R.id.textView5);
		network_operator_name_tv 	= (TextView) findViewById(R.id.textView6);
		network_type_tv 			= (TextView) findViewById(R.id.textView7);
		phone_type_tv 				= (TextView) findViewById(R.id.textView8);
		sim_country_iso_tv 			= (TextView) findViewById(R.id.textView9);
		sim_operator_tv 			= (TextView) findViewById(R.id.textView10);
		sim_operator_name_tv 		= (TextView) findViewById(R.id.textView11);
		sim_serial_number_tv 		= (TextView) findViewById(R.id.textView12);
		sim_state_tv 				= (TextView) findViewById(R.id.textView13);
		subscriber_id_tv 			= (TextView) findViewById(R.id.textView14);
		voice_mail_number_tv 		= (TextView) findViewById(R.id.textView15);

		TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
		StringBuilder sb = new StringBuilder();
		sb.append("\nDeviceId(IMEI) = " 		+ tm.getDeviceId());				//设备ID
		sb.append("\nDeviceSoftwareVersion = " 	+ tm.getDeviceSoftwareVersion());	//设备软件版本
		sb.append("\nLine1Number = " 			+ tm.getLine1Number());				//设备Line1Number
		sb.append("\nNetworkCountryIso = " 		+ tm.getNetworkCountryIso());		//当前的网络提供商的数字名字
		sb.append("\nNetworkOperator = " 		+ tm.getNetworkOperator());
		sb.append("\nNetworkOperatorName = " 	+ tm.getNetworkOperatorName());
		sb.append("\nNetworkType = " 			+ tm.getNetworkType());
		sb.append("\nPhoneType = " 				+ tm.getPhoneType());
		sb.append("\nSimCountryIso = " 			+ tm.getSimCountryIso());
		sb.append("\nSimOperator = " 			+ tm.getSimOperator());
		sb.append("\nSimOperatorName = " 		+ tm.getSimOperatorName());
		sb.append("\nSimSerialNumber = " 		+ tm.getSimSerialNumber());
		sb.append("\nSimState = " 				+ tm.getSimState());
		sb.append("\nSubscriberId(IMSI) = " 	+ tm.getSubscriberId());
		sb.append("\nVoiceMailNumber = " 		+ tm.getVoiceMailNumber());
		Log.e("info", sb.toString());

		device_id = tm.getDeviceId();
		device_software_version = tm.getDeviceSoftwareVersion();
		line1_number = tm.getLine1Number();
		network_country_iso = tm.getNetworkCountryIso();
		network_operator = tm.getNetworkOperator();
		network_operator_name = tm.getNetworkOperatorName();
		network_type = tm.getNetworkType();
		phone_type = tm.getPhoneType();
		sim_country_iso = tm.getSimCountryIso();
		sim_operator = tm.getSimOperator();
		sim_operator_name = tm.getSimOperatorName();
		sim_serial_number = tm.getSimSerialNumber();
		sim_state = tm.getSimState();
		subscriber_id = tm.getSubscriberId();
		voice_mail_number = tm.getVoiceMailNumber();

		device_id_tv.setText("设备ID：" + device_id);
		device_software_version_tv.setText("设备软件版本号" + device_software_version);
		line1_number_tv.setText("设备电话卡号码：" + line1_number);
		network_country_iso_tv.setText("设备的Line1Number" + network_country_iso);
		network_operator_tv.setText("当前网络提供商的数字名字（MCC+MNC的形式）："
				+ network_operator);
		network_operator_name_tv.setText("当前网络提供商的名字（字母形式）："
				+ network_operator_name);
		network_type_tv.setText("用于传输数据的网络的无线类型：" + network_type);
		phone_type_tv.setText("设备用于传输语言的无线类型：" + phone_type);
		sim_country_iso_tv.setText("设备SIM卡提供商的国家代码" + sim_country_iso);
		sim_operator_tv.setText("设备SIM卡的提供商代码：" + sim_operator);
		sim_operator_name_tv.setText("设备SIM卡服务商的名字：" + sim_operator_name);
		sim_serial_number_tv.setText("设备SIM卡的编码" + sim_serial_number);
		sim_state_tv.setText("设备SIM卡的状态：" + sim_state);
		subscriber_id_tv.setText("国际移动用户识别码：" + subscriber_id);
		voice_mail_number_tv.setText("设备的语音邮箱码：" + voice_mail_number);
	}
}