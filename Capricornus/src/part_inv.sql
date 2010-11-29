select "gppw"."tr_part" as tr_part,"gppw"."tr_serial" as tr_serial,"gppw"."tr_qty_chg" as tr_qty_chg , "gppx"."tr_price" as tr_price,("gppw"."tr_qty_chg" * "gppx"."tr_price") as jine from(
	select "gppf"."tr_part" as tr_part , "gppf"."tr_serial" as tr_serial , ("gppf"."tr_qty_chg" + "gppg"."tr_loc_begin") as tr_qty_chg from (
		select "bec"."tr_part" as tr_part,"bec"."tr_serial" as tr_serial, sum ("bec"."tr_qty_chg") as tr_qty_chg from (
			select * from "MFGPROD"."PUB"."tr_hist" where "MFGPROD"."PUB"."tr_hist"."tr_qty_chg"<>0 and "MFGPROD"."PUB"."tr_hist"."tr_part"='1200SZ4R105' and "MFGPROD"."PUB"."tr_hist"."tr_effdate"<='2010-04-01 00:00:00'
		) as bec group by "bec"."tr_part","bec"."tr_serial"
	) as gppf
	left join
	(	
		select "gppi"."tr_part" as tr_part,"gppi"."tr_serial" as tr_serial,"gppi"."tr_trnbr","gppj"."tr_effdate" as tr_effdate,"gppj"."tr_loc_begin" as tr_loc_begin from(
			select "gpph"."tr_part" as tr_part,"gpph"."tr_serial" as tr_serial,"gpph"."tr_trnbr" as tr_trnbr from (
				
				select "tr"."tr_part","tr"."tr_serial", min ("tr"."tr_trnbr") as tr_trnbr from "MFGPROD"."PUB"."tr_hist" as tr group by "tr"."tr_part","tr"."tr_serial"
			
			) as gpph group by "gpph"."tr_part","gpph"."tr_serial","gpph"."tr_trnbr"
		) as gppi inner join
		"MFGPROD"."PUB"."tr_hist" 
		as gppj on "gppi"."tr_part" = "gppj"."tr_part" and "gppi"."tr_serial" = "gppj"."tr_serial" and "gppi"."tr_trnbr" = "gppj"."tr_trnbr"
		where "gppj"."tr_type" in ('RCT-PO','RCT-UNP')
	) as gppg
	on 
	"gppf"."tr_part" = "gppg"."tr_part" and "gppf"."tr_serial" = "gppg"."tr_serial"
) as gppw 
left join
(
	select "gppu"."tr_part" as tr_part,"gppu"."tr_serial" as tr_serial,"gppv"."tr_price" as tr_price from(
		select "bec"."tr_part" as tr_part,"bec"."tr_serial" as tr_serial, min ("bec"."tr_trnbr") as tr_trnbr from (
			select "MFGPROD"."PUB"."tr_hist"."tr_part" as tr_part,"MFGPROD"."PUB"."tr_hist"."tr_serial" as tr_serial,"MFGPROD"."PUB"."tr_hist"."tr_trnbr" as tr_trnbr  from "MFGPROD"."PUB"."tr_hist" where "MFGPROD"."PUB"."tr_hist"."tr_qty_chg" <> 0 and "MFGPROD"."PUB"."tr_hist"."tr_type" in ('RCT-PO','RCT-UNP') 
		) as bec group by "bec"."tr_part","bec"."tr_serial"
	) as gppu
	left join
	"MFGPROD"."PUB"."tr_hist" as gppv
	on "gppu"."tr_trnbr" = "gppv"."tr_trnbr"
) as gppx 
on "gppw"."tr_part" = "gppx"."tr_part" and "gppw"."tr_serial" = "gppx"."tr_serial"  
where "gppw"."tr_qty_chg" <>0
order by "gppw"."tr_part","gppw"."tr_serial"