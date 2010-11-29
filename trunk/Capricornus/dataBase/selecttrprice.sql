
    select
        "tr_part",
        "tr_date",
        "tr_type",
        "tr_loc",
        "tr_qty_chg",
        "tr_qty_short",
        "tr_nbr",
        "tr_price",
        "tr_trnbr",
        "tr_serial",
        "tr_domain",
        "oid_tr_hist" 
    from
        "MFGPROD"."PUB"."tr_hist" where "tr_part" = '5HCRC2043'  and "tr_domain" = 'keer' order by "tr_trnbr"
        
        
        