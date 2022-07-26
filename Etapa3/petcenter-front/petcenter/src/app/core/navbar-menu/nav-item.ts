export interface NavItem {
    displayName: string;
    disabled?: boolean;
    route?: string;
    children?: NavItem[];
  }