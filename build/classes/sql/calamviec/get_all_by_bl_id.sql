select clv.ID, clv.CaKhamID, clv.BangLuongID, clv.NhanVienID, clv.CheckIn, clv.CheckOut, clv.IsCheckedIn, ck.ID, ck.Day, ck.Shift, ck.IsActive
from calamviec clv
join cakham ck on clv.CaKhamID = ck.ID
where clv.BangLuongID = ?