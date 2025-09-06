package ulaval.glo2003.data;

import ulaval.glo2003.Dtos.Product;

import java.util.List;

public class SeedData {
    public static final List<Product> DB = List.of(
            new Product("p-001", "Wireless Keyboard",      "Slim 104-key keyboard with silent keys",              39.99,  false, true),
            new Product("p-002", "Ergo Mouse",              "Vertical ergonomic mouse, 6 buttons",                 29.49,  true,  true),
            new Product("p-003", "27\" 2K Monitor",         "IPS 2560x1440, 75Hz, thin bezels",                   229.00, false, true),
            new Product("p-004", "USB-C Hub 7-in-1",        "HDMI, PD 100W, 2xUSB-A, SD/microSD",                  34.95,  false, true),
            new Product("p-005", "Laptop Stand",            "Aluminum, adjustable height & angle",                 24.90,  true,  false),
            new Product("p-006", "Mechanical Keyboard",     "Hot-swappable, brown switches, RGB",                  79.99,  false, true),
            new Product("p-007", "Noise-Cancel Headset",    "Over-ear ANC with 30h battery",                       119.00, true,  true),
            new Product("p-008", "Webcam 1080p",            "Auto-focus with dual mics and privacy cap",           49.50,  false, false),
            new Product("p-009", "Portable SSD 1TB",        "USB 3.2 Gen2, up to 1,000MB/s",                       89.00,  false, true),
            new Product("p-010", "Microphone USB",          "Cardioid condenser for streaming",                    59.00,  true,  false),
            new Product("p-011", "Desk Mat XL",             "Non-slip PU leather, reversible",                     18.75,  false, false),
            new Product("p-012", "LED Light Strip",         "5m RGB with remote & app control",                    22.99,  true,  true),
            new Product("p-013", "Bluetooth Speaker",       "IPX7 waterproof, 20W driver",                         39.00,  false, true),
            new Product("p-014", "Phone Stand",             "Foldable aluminum phone/tablet holder",               12.49,  false, false),
            new Product("p-015", "USB-C Cable 2m",          "60W PD, braided nylon, pack of 2",                    14.99,  true,  false),
            new Product("p-016", "Wi-Fi 6 Router",          "Dual-band AX1800 with MU-MIMO",                       89.99,  false, true),
            new Product("p-017", "Smart Plug (2-pack)",     "Works with Alexa/Google, energy monitor",             21.90,  true,  true),
            new Product("p-018", "Action Camera 4K",        "EIS, waterproof case included",                       99.00,  false, true),
            new Product("p-019", "Tripod Stand",            "Aluminum, 160cm with phone mount",                    27.50,  true,  false),
            new Product("p-020", "Gaming Mouse Pad",        "Stitched edges, low-friction surface",                11.95,  false, false),
            new Product("p-021", "USB Mic Boom Arm",        "Arm with shock mount & pop filter",                   32.00,  false, true),
            new Product("p-022", "Portable Projector",      "720p native, HDMI/USB, mini form",                    129.00, true,  true),
            new Product("p-023", "HDMI 2.1 Cable",          "3m 48Gbps 8K/60 HDR",                                 16.99,  false, true),
            new Product("p-024", "Wireless Charger",        "15W fast Mag-compatible pad",                         19.50,  true,  false),
            new Product("p-025", "NAS Enclosure 2-Bay",     "Gigabit LAN, RAID 0/1 support",                       159.00, false, true),
            new Product("p-026", "Cable Management Kit",    "Sleeves, clips, ties set",                            13.49,  true,  false),
            new Product("p-027", "Webcam Light",            "Dimmable ring light for monitors",                    25.00,  false, false),
            new Product("p-028", "65W USB-C Adapter",       "65W GaN compact charger",                             31.99,  true,  true),
            new Product("p-029", "Mechanical Switch Set",   "35x tactile switches spare pack",                     22.00,  false, false),
            new Product("p-030", "Desk Shelf Riser",        "Wood/metal monitor stand organizer",                  28.75,  true,  false)
    );
}
