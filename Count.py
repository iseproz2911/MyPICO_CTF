def dem_so_lan_xuat_hien(file_path, chuoi_can_dem):
    count = 0
    with open(file_path, 'r') as file:
        for line in file:
            count += line.count(chuoi_can_dem)
    return count

file_path = 'F:\CyberSecurity\PythonCTF\ReportWire.txt'
chuoi_can_dem = 'MDNS'

so_lan_xuat_hien = dem_so_lan_xuat_hien(file_path, chuoi_can_dem)
print(f"Số lần xuất hiện của chuỗi '{chuoi_can_dem}' trong file là: {so_lan_xuat_hien}")
