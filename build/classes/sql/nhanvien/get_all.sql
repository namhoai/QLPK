select nv.ID, nv.Name, nv.Age, nv.Sex, nv.Level, nv.Specialize, nv.Position, nv.PriceUnit, pk.ID, pk.Name, pk.Local, pk.Description
from nhanvien nv
join phongkham pk on nv.PhongKhamID = pk.ID
order by nv.ID