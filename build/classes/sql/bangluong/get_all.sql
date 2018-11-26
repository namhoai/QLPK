select bl.ID, nv.ID, nv.Age, nv.Sex, nv.Level, nv.Specialize, nv.Position, nv.PriceUnit, pk.ID, pk.Name, pk.Local, pk.Description
from bangluong bl
join nhanvien nv on bl.NhanVienID = nv.ID
join phongkham pk on pk.ID = nv.PhongKhamID
order by bl.ID