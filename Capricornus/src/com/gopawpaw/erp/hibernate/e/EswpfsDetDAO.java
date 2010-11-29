package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EswpfsDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EswpfsDet
 * @author MyEclipse Persistence Tools
 */

public class EswpfsDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EswpfsDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EswpfsDet transientInstance) {
		log.debug("saving EswpfsDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EswpfsDet persistentInstance) {
		log.debug("deleting EswpfsDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EswpfsDet findById(com.gopawpaw.erp.hibernate.e.EswpfsDetId id) {
		log.debug("getting EswpfsDet instance with id: " + id);
		try {
			EswpfsDet instance = (EswpfsDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EswpfsDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EswpfsDet instance) {
		log.debug("finding EswpfsDet instance by example");
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
		log.debug("finding EswpfsDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EswpfsDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EswpfsDet instances");
		try {
			String queryString = "from EswpfsDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EswpfsDet merge(EswpfsDet detachedInstance) {
		log.debug("merging EswpfsDet instance");
		try {
			EswpfsDet result = (EswpfsDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EswpfsDet instance) {
		log.debug("attaching dirty EswpfsDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EswpfsDet instance) {
		log.debug("attaching clean EswpfsDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EswpfsDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EswpfsDetDAO) ctx.getBean("EswpfsDetDAO");
	}
}