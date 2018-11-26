select nv.ID, nv.Name, nv.Age, nv.Sex, nv.Level, nv.Specialize, nv.Position, nv.PriceUnit, nv.Phone
from nhanvien nv
join phongkham pk on nv.PhongKhamID = pk.ID
where nv.PhongKhamID = ?
order by nv.ID