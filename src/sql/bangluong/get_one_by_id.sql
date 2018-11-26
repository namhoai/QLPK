select bl.ID, bl.NhanVienID, bl.PaymentAmount, bl.PaymentDate, bl.Note, bl.Week, bl.Paid
from bangluong bl
where bl.ID = ?