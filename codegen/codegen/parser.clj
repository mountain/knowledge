(ns codegen.parser)

(defn get-title [lang data]
  (get-in data ["sitelinks" (str lang "wiki") "title"]))

(defn get-name [lang data]
  (if-let [name (get-in data ["labels" lang "value"])]
    name
    (get-in data ["sitelinks" (str lang "wiki") "title"])))

(defn get-names [langs data]
  (zipmap langs (map #(get-name % data) langs)))

(defn get-descrs [langs data]
  (zipmap langs (map #(get-in data ["descriptions" % "value"]) langs)))

(defn get-type [claim]
  (get-in claim ["mainsnak" "datavalue" "type"]))

(defn get-time [claim]
  (get-in claim ["mainsnak" "datavalue" "value" "time"]))

(defn get-value [claim]
  (get-in claim ["mainsnak" "datavalue" "value"]))

(defn get-geo-pos [claim]
  (let [value (get-in claim ["mainsnak" "datavalue" "value"])]
    (str
      "lng " (get value "longitude")
      " lat " (get value "latitude")
      " alt " (get value "altitude"))))

(defn get-entity-id [claim]
  (if-let [id (get-in claim ["mainsnak" "datavalue" "value" "numeric-id"])]
    (str "Q" id)))

(defn kind-of [data]
  (get-entity-id (first (get-in data ["claims" "p31"]))))

(defn clazzes-of [data]
  (map get-entity-id (get-in data ["claims" "p31"])))

(defn parents-of [data]
  (map get-entity-id (get-in data ["claims" "p279"])))
