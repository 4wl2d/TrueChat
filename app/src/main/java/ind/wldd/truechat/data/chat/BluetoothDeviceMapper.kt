package ind.wldd.truechat.data.chat


import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import ind.wldd.truechat.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}