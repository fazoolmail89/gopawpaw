package com.gopawpaw.erp.hibernate.i;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * IroDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.i.IroDet
 * @author MyEclipse Persistence Tools
 */

public class IroDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(IroDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(IroDet transientInstance) {
		log.debug("saving IroDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IroDet persistentInstance) {
		log.debug("deleting IroDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IroDet findById(com.gopawpaw.erp.hibernate.i.IroDetId id) {
		log.debug("getting IroDet instance with id: " + id);
		try {
			IroDet instance = (IroDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.i.IroDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(IroDet instance) {
		log.debug("finding IroDet instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding IroDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from IroDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all IroDet instances");
		try {
			String queryString = "from IroDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IroDet merge(IroDet detachedInstance) {
		log.debug("merging IroDet instance");
		try {
			IroDet result = (IroDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IroDet instance) {
		log.debug("attaching dirty IroDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IroDet instance) {
		log.debug("attaching clean IroDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IroDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IroDetDAO) ctx.getBean("IroDetDAO");
	}
}